/**
 * Generator.java
 * 
 * Purpose: logic for generating encounters, items, and events.
 * 
 * @author Mitchell Hansen
 */
package D5DataStructures;

import D5DataStructures.DraftClasses.Encounter;
import D5DataStructures.DraftClasses.Item;
import D5DataStructures.Enemy;
import D5DataStructures.Player;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Generator {
    
    public enum Generator_Type { ENCOUNTER, EVENT, ITEM };

    // Singleton initializer
    private static boolean init = false;
    
    // Hardcoded XP thresholds for encoutner XP caps
    private static HashMap<Integer, List<Integer>> encounter_xp_thresholds;
    
    // An easy way to grab hardcoded rarity spreads
    private static HashMap<Item.Rarity, List<Integer>> probability_spreads;

    
    private static void Initialize(){
        init = true;
        

        
        // Oh boy
        // The xp mods per level for max level cap
        encounter_xp_thresholds = new HashMap<Integer, List<Integer>>();
        encounter_xp_thresholds.put(0, Arrays.asList(0, 0, 0, 0));
        encounter_xp_thresholds.put(1, Arrays.asList(25, 50, 75, 100));
        encounter_xp_thresholds.put(2, Arrays.asList(50, 100, 150, 200));
        encounter_xp_thresholds.put(3, Arrays.asList(75, 150, 225, 400));
        encounter_xp_thresholds.put(4, Arrays.asList(125, 250, 375, 500));
        encounter_xp_thresholds.put(5, Arrays.asList(250, 500, 750, 1100));
        encounter_xp_thresholds.put(6, Arrays.asList(300, 600, 900, 1400));
        encounter_xp_thresholds.put(7, Arrays.asList(350, 750, 1100, 1700));
        encounter_xp_thresholds.put(8, Arrays.asList(450, 900, 1400, 2100));
        encounter_xp_thresholds.put(9, Arrays.asList(550, 1100, 1600, 2400));
        encounter_xp_thresholds.put(10, Arrays.asList(600, 1200, 1900, 2800));
        encounter_xp_thresholds.put(11, Arrays.asList(800, 1600, 2400, 3600));
        encounter_xp_thresholds.put(12, Arrays.asList(1000, 2000, 3000, 4500));
        encounter_xp_thresholds.put(13, Arrays.asList(1100, 2200, 3400, 5100));
        encounter_xp_thresholds.put(14, Arrays.asList(1250, 2500, 3800, 5700));
        encounter_xp_thresholds.put(15, Arrays.asList(1400, 2800, 4300, 6400));
        encounter_xp_thresholds.put(16, Arrays.asList(1600, 3200, 4800, 7200));
        encounter_xp_thresholds.put(17, Arrays.asList(2000, 3900, 5900, 8800));
        encounter_xp_thresholds.put(18, Arrays.asList(2100, 4200, 6300, 9500));
        encounter_xp_thresholds.put(19, Arrays.asList(2400, 4900, 7300, 10900));
        encounter_xp_thresholds.put(20, Arrays.asList(2800, 5700, 8500, 12700));
        
        // More hardcoded values.
        // These set the probability of the rarity of items in generated item pools
        probability_spreads = new HashMap<Item.Rarity, List<Integer>>();
        //                                                    Point Spread: pretty much abritrary
        //                                                            C   U   R   V   L
        probability_spreads.put(Item.Rarity.COMMON, Arrays.asList    (97, 2 , 1 , 0 , 0 ));
        probability_spreads.put(Item.Rarity.UNCOMMON, Arrays.asList  (17, 80, 2 , 1 , 0 ));
        probability_spreads.put(Item.Rarity.RARE, Arrays.asList      (4 , 13, 80, 2 , 1 ));
        probability_spreads.put(Item.Rarity.VERYRARE, Arrays.asList  (1 , 3 , 13, 80, 3));
        probability_spreads.put(Item.Rarity.LEGENDARY, Arrays.asList (0 , 1 , 3 , 13, 83));

    }
    /**
     * Generate an Encounter based on input from the user.
     * 
     * @param enemies 
     * @param players
     * @param difficulty
     * @param location
     * @param encounter_type
     * @return 
     */
    public static Encounter Generate_Encounter(ArrayList<Enemy> enemies, ArrayList<Player> players, 
                                               Encounter.DIFFICULTY difficulty, Encounter.LOCATION location,
                                               Encounter.Encounter_Type encounter_type){
        if (!init){
            Initialize();
        }
        
        if (players.size() == 0 || enemies.size() == 0){
            return null;
        }
        
        // Get the list of enemies matching the location
        ArrayList<Enemy> parsed_location_list = new ArrayList<Enemy>();
        parsed_location_list = enemies;
//      if (location.equals(Encounter.LOCATION.NULL)){ // If default, add everything
//          parsed_location_list = enemies; 
//      }
//        else
//        {
//            for (Enemy e : enemies){
//                if (enemies.getLocation().equals(location)){
//                    parsed_location_list.add(e);
//                }
//            }
//        }
//        
//        
        
        // Get the XP cap of the party
        
        int xp_cap = 0;
        for (Player p: players){
            int level = p.getLevel();
            
            switch (difficulty){
                case EASY:
                    xp_cap += encounter_xp_thresholds.get(level).get(0);
                    break;
                case MEDIUM:
                    xp_cap += encounter_xp_thresholds.get(level).get(1);
                    break;
                case HARD:
                    xp_cap += encounter_xp_thresholds.get(level).get(2);
                    break;
                case DEADLY:
                    xp_cap += encounter_xp_thresholds.get(level).get(3);
                    break;
                default:
                    throw new AssertionError(difficulty.name());
            }
        }

        // Determine approx. the number of enemies that we want to grab and adjust
        // the prefered xp level for the monsters, and the xp_cap that we build to
        
        int prefered_xp_level = 0;      // Of the monsters
        int prefered_enemy_count = 0;   // Of the encounter
        
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
        // defined by the deviation, if 0 then retry with a higher deviation
        
        while (initial_selection_list.isEmpty()){
            
            // If the deviation becomes greater than the xp_cap. Somethings wrong
            if (deviation > xp_cap)
                return null;
            
            deviation += prefered_xp_level / 3 + 1;
            for (Enemy e: parsed_location_list){
                int xp_level = e.getExpValue();
                if (xp_level < prefered_xp_level + deviation &&
                    xp_level > prefered_xp_level - deviation &&
                    xp_level != 0){
                    initial_selection_list.add(e);
                }
            } 
        }
        
        selection_list.addAll(initial_selection_list);
        
        int not_success_count = 0;
        boolean success = false;
        while (!success){
            
            // Shuffle up the enemies
            long seed = System.nanoTime();
            Random rand = new Random(seed);
            Collections.shuffle(selection_list, rand);
            
            int current_xp = 0;
            int miss_count = 0; // Deviation addition kicker
            
            // While we are under the xp cap, and we haven't deviated
            // past the xp cap
            while ((xp_cap - xp_cap / 10 > current_xp) &&
                   (deviation < xp_cap) ){
                
                // Get a random entity from the range
                Enemy e = selection_list.get(rand.nextInt((selection_list.size())));

                int xp = e.getExpValue();
                
                // If the xp + the current xp wont overshoot the xp_cap
                if (xp + current_xp < xp_cap + xp_cap / 10){
                    current_xp += xp;     // Add it to the xp count
                    output_list.add(e);   // Add the enemy
                    miss_count = 0;       // Reset the deviation kick
                }
                
                else{
                    miss_count++;
                    
                    // If the miss count equals the selection list * some N
                    // Then expand the bound. If you want the bound to expand more
                    // rapidly, thus introducing more variation in mob XP levels,
                    // Lower either the N or choose some small number, i.e
                    // miss_count < 20
                    if (miss_count == selection_list.size() * 4){ // Lower the 4 to introduce more variation in enemy types
                        
                        // Yuck, copy pasta, but it works!
                        
                        // Clear the selection list, we need to re-add everything
                        // Lame, but I don't want to store more state
                        selection_list.clear();
                        miss_count = 0;
                        
                        // The While should not be needed, but best to be safe
                        while (selection_list.isEmpty()){
                            for (Enemy enemy: parsed_location_list){
                                int xp_level = enemy.getExpValue();
                                if (xp_level < prefered_xp_level + deviation &&
                                    xp_level > prefered_xp_level - deviation && 
                                    xp_level != 0){
                                    selection_list.add(enemy);
                                }
                            }
                            
                            // Advance the deviation, + lame edge case
                            deviation += (prefered_xp_level / 10) + 1;
                        }
                    
                        Collections.shuffle(selection_list, rand);
                    }
                }
            }
            
            // Give it a little breathing room. Who cares if it's a little few more
            // or less mobs. Scales on the mob count as well
            if ((prefered_enemy_count + prefered_enemy_count / 3 >= output_list.size()   &&
                prefered_enemy_count - prefered_enemy_count / 3 <= output_list.size())   ||
                prefered_enemy_count + 1 == output_list.size()){ // Dumb edge case for small parties
                success = true;
            }
            else{ // Do it again, it failed
                if (not_success_count > 100){ // Don't get stuck if the generation is
                    return null;              // actually impossible
                }
                
                // Reset all the values
                selection_list.clear();
                selection_list.addAll(initial_selection_list);
                output_list.clear();
                deviation = prefered_xp_level / 10;
                current_xp = 0;
                miss_count = 0;

                // Keep track of the fail state
                not_success_count++;
            }
        }
        
        return new Encounter(output_list, location, difficulty);
    }
    
    
    public static ArrayList<Item> Generate_Magic_Items(
            Item.Rarity loot_rarity, 
            int number_of_items, 
            ArrayList<Item.Magic_Item_Type> loot_types,
            ArrayList<Item> itemList){
        

        
        
        
        
        
        
        
        return new ArrayList<Item>();
    }
}

