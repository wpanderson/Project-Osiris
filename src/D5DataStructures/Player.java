// Player extends Entity to store all information about a player character that
// does not apply to all other beings in the game world; for instance, no
// Entity other than a player has skill proficiencies, so those are stored here.
// Will be the base class for storing player data.

package D5DataStructures;

import java.util.*;

public class Player extends DataItem {

    // You shouldn't ever call the default constructor by itself, but
    // it could be useful if you want to populate the entities values
    // through Entity.addStat(String, String);
    public Player(){
        super();
    }
    
    // 
    public Player(HashMap<String, String> stats){
        super(stats);
    }
    
    public ArrayList<UUID> getInventoryUUIDs(){
        String unsplit_ids = stats.get("Inventory");
        
        if (unsplit_ids == null){
            System.out.println("This Player does not contain an Inventory");
            return null;
        }
        
        String[] split_ids = unsplit_ids.split(", ");
        
        ArrayList<UUID> ids = new ArrayList<UUID>();
        
        for(String s : split_ids){
            UUID uuid = null;
            try{
                uuid = UUID.fromString(s);
                ids.add(uuid);
            }
            catch (IllegalArgumentException e){
                System.out.println("UUID invalid for Player Inventory UUID : " + s);
            }
            
        }
        
        return ids;
    }
}
