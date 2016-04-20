
<<<<<<< HEAD:src/Test_Of_Possible_Data_Structures/Event.java
package Test_Of_Possible_Data_Structures;
=======
package D5DataStructures;
>>>>>>> 6c7d85cdf489b29470c9ff5e8fc4dcc576fda104:src/D5DataStructures/Event.java

import java.util.ArrayList;
import java.util.UUID;


<<<<<<< HEAD:src/Test_Of_Possible_Data_Structures/Event.java
public class Event implements java.io.Serializable, LoadStore {
=======
public class Event implements java.io.Serializable {
>>>>>>> 6c7d85cdf489b29470c9ff5e8fc4dcc576fda104:src/D5DataStructures/Event.java

    
    private UUID event_id;
    public UUID getID(){
        return event_id;
    }
    
    public enum LOCATION { PLAINS, FOREST, HILLS, MOUNTAINS, MARSH, DESERT, UNDERGROUND,
                    AQUATIC, UNDERDARK, ABYSS, NINEHELLS, GEHENNA };
    
    public enum DIFFICULTY { VERYEASY, EASY, MEDIUM, DIFFICULT };
    
    private ArrayList<UUID> entity_ids;
    private LOCATION location;
    private DIFFICULTY difficulty;
    
    public Event() {
        entity_ids = new ArrayList<UUID>();
    }
    
    public void AddEntity(Entity e){
        entity_ids.add(e.getID());
    }
    
    public void RemoveEntity(UUID entity_id){
        if (!entity_ids.remove(entity_id))
            System.out.println("Entity: " + entity_id + " not found, not removed from Event: " + event_id);
    }
    
    public LOCATION getLocation(){
        return location;
    }
       
    public DIFFICULTY getDifficulty(){
        return difficulty;
    }
    
    public ArrayList<UUID> getEntitites(){
        return entity_ids;
    }
    
    @Override
<<<<<<< HEAD:src/Test_Of_Possible_Data_Structures/Event.java
    public String FormatForStorage() {
=======
    public String formatForStorage() {
>>>>>>> 6c7d85cdf489b29470c9ff5e8fc4dcc576fda104:src/D5DataStructures/Event.java
            String output =
                "event[" + event_id + "]{\n" +
                "diffifulty[" + difficulty + "]\n" +
                "location[" + location + "]\n" +
                "entities[";
                
                for (int i = 0; i < entity_ids.size(); i++){
                    if (i == entity_ids.size() - 1){
                        output += entity_ids.get(i);
                    }
                    else{
                        output += entity_ids.get(i) + ",";
                    }
                }
                        
                output += "]\n}";
                return output;
    }
    
    // The rest of the interaction with this will come from what the UI needs to access
}
