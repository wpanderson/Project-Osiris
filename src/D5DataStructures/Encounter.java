// TENTATIVE: Needs cleanup
// Question: why was this named "Event" and not "Encounter?" (renaming for now)
// I can imagine ways in which an encounter is distinct from an event, but
// this seems to fit my idea of an encounter more than my idea of an event.

package D5DataStructures;


import java.util.ArrayList;
import java.util.UUID;


public class Encounter extends DataItem {

    
    private UUID event_id;
    public UUID getID(){
        return event_id;
    }
    
    public enum LOCATION { PLAINS, FOREST, HILLS, MOUNTAINS, MARSH, DESERT, UNDERGROUND,
                    AQUATIC, UNDERDARK, ABYSS, NINEHELLS, GEHENNA, DEFAULT };
    
    public enum DIFFICULTY { EASY, MEDIUM, HARD, DEADLY };
    
    private ArrayList<Enemy> enemies;
    private LOCATION location;
    private DIFFICULTY difficulty;
    
    public Encounter() {
        enemies = new ArrayList<Enemy>();
    }
    public Encounter(ArrayList<Enemy> enemies, LOCATION location, DIFFICULTY difficulty) {
        this.enemies = enemies;
        this.location = location;
        this.difficulty = difficulty;
    }
    
    public void AddEnemy(Enemy e){
       // entity_ids.add(e.getID());
    }
    
    public void RemoveEnemy(Enemy enemy){
        
    }
    
    public LOCATION getLocation(){
        return location;
    }
       
    public DIFFICULTY getDifficulty(){
        return difficulty;
    }
    
    public ArrayList<Enemy> getEnemies(){
        return enemies;
    }
}
