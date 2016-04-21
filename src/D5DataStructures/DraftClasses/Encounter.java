// TENTATIVE: Needs cleanup
// Question: why was this named "Event" and not "Encounter?" (renaming for now)
// I can imagine ways in which an encounter is distinct from an event, but
// this seems to fit my idea of an encounter more than my idea of an event.

package D5DataStructures.DraftClasses;

import D5DataStructures.Entity;
import java.util.ArrayList;
import java.util.UUID;


public class Encounter implements java.io.Serializable {

    
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
    
    public Encounter() {
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
}
