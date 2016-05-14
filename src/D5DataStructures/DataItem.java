// Entity stores data for any game-world being that the user
// wishes to store in the database, including players and their stats, as well
// as other combat-viable NPCs (enemies, allies, etc).  May also be extended to
// include non-combat-viable NPCs, in which case irrelevant stats would contain
// stock, placeholder or dummy values.

package D5DataStructures;

import java.util.*;
import java.util.Map.Entry;
import static java.util.UUID.randomUUID;

public abstract class DataItem {
    
    // Align : LAWFUL GOOD, LAWFUL NEUTRAL, LAWFUL EVIL, NEUTRAL GOOD, TRUE NEUTRAL, NEUTRAL EVIL, CHAOTIC GOOD, CHAOTIC NEUTRAL, CHAOTIC EVIL
    // Class : CIVILIAN, BARBARIAN, BARD, CLERIC, DRUID, FIGHTER, MONK, PALADIN, RANGER, ROUGE, SORCERER, WARLOCK, WIZARD
    // Race  : DRAGONBORN, DWARF, ELF, GNOME, HALF_ELF, HALF_ORC, HALFING, HUMAN, TIEFLING, AARAKOCRA, GENASI, GOLIATH
    
    public static UUID generateID(){
        return randomUUID();
    }
    
    
    public enum Data_Type {PLAYER, ENEMY, ENCOUNTER, ITEM, NOTE}
    
    
    protected HashMap<String, String> stats;
    
    public DataItem(){
    }
    
    public void incrementIntegerStat(String stat_name, int val){
        String stat = stats.get(stat_name);
        
        if (stat == null){
            System.out.println("Entity does not contain stat : " + stat_name);
            return;
        }
        try{
            // Parse to an int, and add to the input
            val += Integer.parseInt(stat);
            
            // Save back to the map, overwriting the old value
            stats.put(stat_name, String.valueOf(val));
        }
        catch(NumberFormatException e){
            System.out.println("Unable to parse stat from string. "
                    + "Are you calling to the correct data type?");
            System.out.println(e);
        }
    }
    
    public void appendStringStat(String stat_name, String val){
        String stat = stats.get(stat_name);
        
        if (stat == null){
            System.out.println("Entity does not contain stat : " + stat_name);
            return;
        }

        // Append the stat to the old value, using a comma
        val += ", " + stat;

        // Save back to the map, overwriting the old value
        stats.put(stat_name, val);

    }
    
    public void addStat(String stat_name, String val){
        
        // Quotes screws things up. Change to double apostrophes
        val.replaceAll("\"", "''");
        
        if (stats.containsKey(stat_name)){
            System.out.println("Error adding stat, already present : " + stat_name);
            System.out.println("Overwriting!!!");
        }   
        stats.put(stat_name, val);
    }
    
    public void overwriteStringStat(String stat_name, String val){
        
        // Quotes screws things up. Change to double apostrophes
        val.replaceAll("\"", "''");
        
        String prev_val = stats.get(stat_name);
        
        if (prev_val == null){
            System.out.println("Entity does not contain stat : " + stat_name);
            System.out.println("No modification preformed");
        }
        else{
            prev_val = val;
        }
    }
    
    public void overwriteIntegerStat(String stat_name, int val){
        String stat = stats.get(stat_name);
        
        if (stat == null){
            System.out.println("Entity does not contain stat : " + stat_name);
            return;
        }
        try{
            // Parse to an int, and add to the input
            val = Integer.parseInt(stat);
            
            // Save back to the map, overwriting the old value
            stats.put(stat_name, String.valueOf(val));
        }
        catch(NumberFormatException e){
            System.out.println("Unable to parse stat from string. "
                    + "Are you calling to the correct data type?");
            System.out.println(e);
        }
    }
    public String getStat(String stat_name){
        String val = stats.get(stat_name);
        
        if (val == null){
            System.out.println("Entity does not contain stat : " + stat_name);
            return "null";
        }
        return val;
    }
    
    public int getIntegerStat(String stat_name){
        String stat = stats.get(stat_name);
        
        if (stat == null){
            System.out.println("Entity does not contain stat : " + stat_name);
            return -1;
        }
        try{
            // Parse to an int, and add to the input
            return Integer.parseInt(stat);
            
        }
        catch(NumberFormatException e){
            System.out.println("Unable to parse stat from string. "
                    + "Are you calling to the correct data type?");
            System.out.println(e);
            return -1;
        }
    }
    
    public ArrayList<String> listAvailableStats(){
        ArrayList<String> data = new ArrayList<String>();
        for (Map.Entry<String, String> entry : stats.entrySet()) {
            data.add(entry.getKey());
        }
        return data;
    }
    
    public DataItem(HashMap<String, String> stats){
        this.stats = stats; 
    }
    
    // To do: make this return more more meaningful data, for more thorough testing
    public String toString() {
        String data = new String();
        for (Map.Entry<String, String> entry : stats.entrySet()) {
            data += entry.getKey() + ": " + entry.getValue() + "\n";
        }
        return data;
    }
    
    public HashMap<String, String> exportStats(){
        return new HashMap<String, String>(stats); // I think this copies? Depends on String class
    }
    
    
    
}