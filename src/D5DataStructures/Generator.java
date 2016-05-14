package D5DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Generator {
    
    public enum Generator_Type { ENCOUNTER, EVENT, ITEM };
    public enum Encounter_Type {SWARM, SMALLSWARM, SINGLEBOSS, BOSS, MIXED};
    
    private static boolean init = false;
    private static HashMap<Integer, List<Integer>> xp_thresholds;
    
    private static void Initialize(){
        init = true;
        
        xp_thresholds = new HashMap<Integer, List<Integer>>();
        
        // Oh boy
        // The xp mods per level for max level cap
        xp_thresholds.put(1, Arrays.asList(25, 50, 75, 100));
        xp_thresholds.put(2, Arrays.asList(50, 100, 150, 200));
        xp_thresholds.put(3, Arrays.asList(75, 150, 225, 400));
        xp_thresholds.put(4, Arrays.asList(125, 250, 375, 500));
        xp_thresholds.put(5, Arrays.asList(250, 500, 750, 1100));
        xp_thresholds.put(6, Arrays.asList(300, 600, 900, 1400));
        xp_thresholds.put(7, Arrays.asList(350, 750, 1100, 1700));
        xp_thresholds.put(8, Arrays.asList(450, 900, 1400, 2100));
        xp_thresholds.put(9, Arrays.asList(550, 1100, 1600, 2400));
        xp_thresholds.put(10, Arrays.asList(600, 1200, 1900, 2800));
        xp_thresholds.put(11, Arrays.asList(800, 1600, 2400, 3600));
        xp_thresholds.put(12, Arrays.asList(1000, 2000, 3000, 4500));
        xp_thresholds.put(13, Arrays.asList(1100, 2200, 3400, 5100));
        xp_thresholds.put(14, Arrays.asList(1250, 2500, 3800, 5700));
        xp_thresholds.put(15, Arrays.asList(1400, 2800, 4300, 6400));
        xp_thresholds.put(16, Arrays.asList(1600, 3200, 4800, 7200));
        xp_thresholds.put(17, Arrays.asList(2000, 3900, 5900, 8800));
        xp_thresholds.put(18, Arrays.asList(2100, 4200, 6300, 9500));
        xp_thresholds.put(19, Arrays.asList(2400, 4900, 7300, 10900));
        xp_thresholds.put(20, Arrays.asList(2800, 5700, 8500, 12700));

    }
    
    public static Encounter Generate_Encounter(ArrayList<Enemy> enemies, ArrayList<Player> players, 
                                               Encounter.DIFFICULTY difficulty, Encounter.LOCATION location,
                                               Encounter_Type encounter_type){
        if (!init){
            Initialize();
        }
        
        // Get the list of enemies matching the location
        ArrayList<Enemy> parsed_location_list = new ArrayList<Enemy>();
        
        if (location.equals(Encounter.LOCATION.DEFAULT)){ // If default, add everything
            parsed_location_list = enemies; 
        }
        else
        {
            for (Enemy e : enemies){
                if (e.getStat("Location").equals(location)){
                    parsed_location_list.add(e);
                }
            }
        }
        
        
        
        int xp_cap = 0;
        // Get the XP threshold for the party
        for (Player p: players){
            int level = Integer.parseInt(p.getStat("XP"));
            
            switch (difficulty){
                case EASY:
                    xp_cap += xp_thresholds.get(level).get(0);
                    break;
                case MEDIUM:
                    xp_cap += xp_thresholds.get(level).get(1);
                    break;
                case HARD:
                    xp_cap += xp_thresholds.get(level).get(2);
                    break;
                case DEADLY:
                    xp_cap += xp_thresholds.get(level).get(3);
                    break;
                default:
                    throw new AssertionError(difficulty.name());
                
            }
        }

        // Determine approx. the number of enemies that we want to grab and adjust
        // the prefered xp level for the monsters, and the xp_cap that we build to
        
        int prefered_xp_level = 0;
        int prefered_enemy_count = 0;
        
        switch (encounter_type){
            case SWARM:
                // And add the multiplier mod for the number of mobs
                // more mobs = more hard
                xp_cap = (int ) (xp_cap / 3);

                // Prefered level for the mobs aka number of mobs
                prefered_xp_level = (int) (xp_cap / 16);
                
                // The number of entities we want to throw at the player
                prefered_enemy_count = 16;
                
                break;
                
            case SMALLSWARM:
                xp_cap = (int) (xp_cap / 2.5);
                prefered_xp_level = (int) (xp_cap / 8);
                prefered_enemy_count = 8;
                break;
                
            case MIXED:
                xp_cap = (int) (xp_cap / 2);
                prefered_xp_level = (int) (xp_cap / 4);
                prefered_enemy_count = 4;
                break;
                
            case BOSS:
                xp_cap = (int) (xp_cap / 1.5);
                prefered_xp_level = (int) (xp_cap / 2);
                prefered_enemy_count = 2;
                break;
                
            case SINGLEBOSS:
                prefered_xp_level = (int) (xp_cap);
                prefered_enemy_count = 1;
                xp_cap = (int) (xp_cap / 1);
                break;

            default:
                throw new AssertionError(encounter_type.name());
        }
        
        // The range of values to look for
        int deviation = 0;
        
        ArrayList<Enemy> output_list = new ArrayList<Enemy>();
        ArrayList<Enemy> selection_list = new ArrayList<Enemy>();
        ArrayList<Enemy> initial_selection_list = new ArrayList<Enemy>();
        
        // fill the selection list with enemies that are within the range
        // defined by the deviation, if 0 then retry
        while (initial_selection_list.size() == 0){
            deviation += prefered_xp_level / 3;
            for (Enemy e: parsed_location_list){
                int xp_level = e.getIntegerStat("XP");
                if (xp_level < prefered_xp_level + deviation &&
                    xp_level > prefered_xp_level - deviation){
                    initial_selection_list.add(e);
                }
            } 
        }
        
        selection_list.addAll(initial_selection_list);
        

        boolean success = false;
        while (!success){
            
            // Shuffle up the enemies
            long seed = System.nanoTime();
            Random rand = new Random(seed);
            Collections.shuffle(selection_list, rand);
            
            int current_xp = 0;
            int miss_count = 0; // Deviation addition kicker
            
            while (xp_cap - xp_cap / 10 > current_xp){
                // Get a random entity from the range
                
                 long seed2 = System.nanoTime();
                Random rand2 = new Random(seed2);
                Enemy e = selection_list.get(rand2.nextInt((selection_list.size())));

                int xp = e.getIntegerStat("XP");
                
                // If the xp + the current xp wont overshoot the xp_cap
                if (xp + current_xp < xp_cap + xp_cap / 10){
                    current_xp += xp;     // Add it to the xp count
                    output_list.add(e);   // Add the enemy
                    miss_count = 0;       // Reset the deviation kick
                }
                
                else{
                    miss_count++;
                    if (miss_count == selection_list.size() * 4){
                        deviation += prefered_xp_level / 10;
                        
                        // Yuck, copy pasta, but it works!
                        selection_list.clear();
                        miss_count = 0;
                        
                        for (Enemy enemy: parsed_location_list){
                            int xp_level = enemy.getIntegerStat("XP");
                            if (xp_level < prefered_xp_level + deviation &&
                                xp_level > prefered_xp_level - deviation){
                                selection_list.add(enemy);
                            }
                        }
                        if (selection_list.size() == 0){
                            deviation += prefered_xp_level / 10; 
                        }
                    
                        Collections.shuffle(selection_list, rand);
                    }
                }
            }
            
            // Give it a little breathing room. Who cares if it's a little few more
            // or less mobs. Scales on the mob count as well
            if (prefered_enemy_count + prefered_enemy_count / 3 >= output_list.size()   &&
                prefered_enemy_count - prefered_enemy_count / 3 <= output_list.size() ){
                int a = prefered_enemy_count + prefered_enemy_count / 3;
                success = true;
            }
            else{ // Do it again, it failed
                selection_list.clear();
                selection_list.addAll(initial_selection_list);
                output_list.clear();
                deviation = prefered_xp_level / 10;
                current_xp = 0;
                miss_count = 0;
            }
        }
        for (Enemy i: output_list){
            System.out.print(i.getStat("XP") + " : " + i.getStat("Name") + "\n");
        }
        
        System.out.println("\n");
        
        return new Encounter(output_list, location, difficulty);
    } 
    
    
    public static Item itemGenerator(Item.Item_Properties item_type){
        switch (item_type){
            case AMMUNITION:
                // Grab random name
                break;
            case FINESSE:
                break;
            case HEAVY:
                break;
            case LIGHT:
                break;
            case LOADING:
                break;
            case RANGE:
                break;
            case REACH:
                break;
            case SPECIAL:
                break;
            case THROWN:
                break;
            case TWOHANDED:
                break;
            case VERSITILE:
                break;
            case MISC:
                break;
            default:
                throw new AssertionError(item_type.name());
        }
        
        return null;
    }
}

