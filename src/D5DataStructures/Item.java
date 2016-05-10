// TENTATIVE; needs cleanup
// Item class represents one type of item that can be possessed by an Entity.
// Ownership will be handled by having the owner's inventory
// reference a specific item, either by UUID or with a pointer.  The owner's
// inventory may also handle the quantity of an item possessed.

package D5DataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Item {
    
    private UUID itemID;
    private UUID getID(){
        return itemID;
    }

    public enum Type { AMMUNITION, FINESSE, HEAVY, LIGHT, LOADING, RANGE, REACH, SPECIAL, 
                       THROWN, TWOHANDED, VERSITILE };
    
    private HashMap<String, String> stats;
    
    public Item (HashMap<String, String> stats){
        this.stats = stats;
    }
    
    public Item(String name,
                String cost,
                String weight,
                String damage,
                String normal_range,
                String max_range,
                String id,
                String type,
                String notes){
        
        stats = new HashMap<String, String>();
        stats.put("Name", name);
        stats.put("Cost", cost);
        stats.put("Weight", weight);
        stats.put("Damage", damage);
        stats.put("Normal_Range", normal_range);
        stats.put("Max_Range", max_range);
        stats.put("ID", id);
        stats.put("Type", type);
        stats.put("Notes", notes);
        
    }
    
    public String getItemProperties(){
        String q = stats.get("Type");
        if (q == null){
            System.out.println("This item does not contain properties");
        }
        return q;
    }
    
    public void addItemProperty(String property){
        String q = stats.get("Type");
        if (q == null){
            stats.put("Type", q);
        }
        else{
            q += ", " + property;
        } 
    }
    
    public String getMaxRange(){
        String q = stats.get("Max_Range");
        if (q == null){
            System.out.println("This item does not contain a max range");
        }
        return q;
    }
    
    public String getNormalRange(){
        return normal_range;
    }
    
    public String getName(){
        return name;
    }
    
    public String getCost(){
        return cost_cp;
    }
    
    public String getWeight(){
        return weight_lb;
    }
    
    public String getDamage(){
        return damage;
    }    
}
