// Entity stores data for any game-world being that the user
// wishes to store in the database, including players and their stats, as well
// as other combat-viable NPCs (enemies, allies, etc).  May also be extended to
// include non-combat-viable NPCs, in which case irrelevant stats would contain
// stock, placeholder or dummy values.

package D5DataStructures;

import java.util.*;
import java.util.Map.Entry;

public class Entity {
    
    // Align : LAWFUL GOOD, LAWFUL NEUTRAL, LAWFUL EVIL, NEUTRAL GOOD, TRUE NEUTRAL, NEUTRAL EVIL, CHAOTIC GOOD, CHAOTIC NEUTRAL, CHAOTIC EVIL
    // Class : CIVILIAN, BARBARIAN, BARD, CLERIC, DRUID, FIGHTER, MONK, PALADIN, RANGER, ROUGE, SORCERER, WARLOCK, WIZARD
    // Race  : DRAGONBORN, DWARF, ELF, GNOME, HALF_ELF, HALF_ORC, HALFING, HUMAN, TIEFLING, AARAKOCRA, GENASI, GOLIATH

    protected HashMap<String, String> stat_map;
    
    public Entity(){
    }
    
    public void addStat(String name, String val){
        if (stat_map.containsKey(name)){
            System.out.println("Error adding stat, already present : " + name);
            System.out.println("Overwriting!!!");
        }   
        stat_map.put(name, val);
    }
    
    public void modStat(String name, String val){
        String prev_val = stat_map.get(name);
        
        if (prev_val == null){
            System.out.println("Entity does not contain stat : " + name);
            System.out.println("No modification preformed");
        }
        else{
            prev_val = val;
        }
    }
    public String getStat(String name){
        String val = stat_map.get(name);
        
        if (val == null){
            System.out.println("Entity does not contain stat : " + name);
            return "null";
        }
        return val;
    }
    
    public Entity(HashMap<String, String> stats){
        stat_map = stats; 
    }
    
    // To do: make this return more more meaningful data, for more thorough testing
    public String toString() {
        String data = new String();
        for (Map.Entry<String, String> entry : stat_map.entrySet()) {
            data += entry.getKey() + ", " + entry.getValue() + "\n";
        }
        return data;
    }
}