package D5DataStructures.DraftClasses;

// TENTATIVE: Needs cleanup
// Question: why was this named "Event" and not "Encounter?" (renaming for now)
// I can imagine ways in which an encounter is distinct from an event, but
// this seems to fit my idea of an encounter more than my idea of an event.



import D5DataStructures.Enemy;
import D5DataStructures.Entity;
import java.util.ArrayList;
import java.util.UUID;


public class Encounter implements java.io.Serializable {

    
    private UUID event_id;

    public Encounter(ArrayList<Enemy> output_list, LOCATION location, DIFFICULTY difficulty) {
        enemies = output_list;
        this.location = location;
        this.difficulty = difficulty;
    }


    
    public UUID getID(){
        return event_id;
    }
    
    public enum LOCATION { PLAINS, FOREST, HILLS, MOUNTAINS, MARSH, DESERT, UNDERGROUND,
                    AQUATIC, UNDERDARK, ABYSS, NINEHELLS, GEHENNA , NULL};
    
    public enum DIFFICULTY { EASY, MEDIUM, HARD, DEADLY };
    
    public enum Encounter_Type {SWARM, SMALLSWARM, SINGLEBOSS, BOSS, MIXED};
    
    private ArrayList<Enemy> enemies;
    private LOCATION location;
    private DIFFICULTY difficulty;
    
    public Encounter() {
        enemies = new ArrayList<Enemy>();
    }
    

    public void AddEntity(Enemy e){
        enemies.add(e);
    }
    
//    public void RemoveEntity(UUID entity_id){
//        if (!entity_ids.remove(entity_id))
//            System.out.println("Entity: " + entity_id + " not found, not removed from Event: " + event_id);
//    }
    
    public LOCATION getLocation(){
        return location;
    }
       
    public DIFFICULTY getDifficulty(){
        return difficulty;
    }
    
    public ArrayList<Enemy> getEnemies(){
        return enemies;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Enemy e: enemies){
            sb.append(e.getExpValue() + "  :  " + e.getName() + "\n");
        }
        return sb.toString();
    }
}
