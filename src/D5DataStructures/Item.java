// TENTATIVE; needs cleanup
// Item class represents one type of item that can be possessed by an Entity.
// Ownership will be handled by having the owner's inventory
// reference a specific item, either by UUID or with a pointer.  The owner's
// inventory may also handle the quantity of an item possessed.

package D5DataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import static java.util.UUID.randomUUID;

public class Item extends DataItem{
   
   public enum Item_Properties {AMMUNITION, FINESSE, HEAVY, LIGHT, LOADING, RANGE, REACH, SPECIAL, THROWN, TWOHANDED, VERSITILE, MISC};
    
    private HashMap<String, String> stats;
    
    public Item (HashMap<String, String> stats){
        super();
        this.stats = stats;
 
    }
    
    public Item(String name,
                String cost,
                String weight,
                String damage,
                String normal_range,
                String max_range,
                UUID id,
                String type,
                String notes){
        super();
        stats = new HashMap<String, String>();
        stats.put("Name", name);
        stats.put("Cost", cost);
        stats.put("Weight", weight);
        stats.put("Damage", damage);
        stats.put("Normal_Range", normal_range);
        stats.put("Max_Range", max_range);
        stats.put("ID", id.toString());
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
        String q = stats.get("Normal_Range");
        if (q == null){
            System.out.println("This item does not contain a normal range");
        }
        return q;
    }
    
    public String getName(){
        String q = stats.get("Name");
        if (q == null){
            System.out.println("This item does not contain a name");
        }
        return q;
    }
    
    public String getCost(){
        String q = stats.get("Cost");
        if (q == null){
            System.out.println("This item does not contain a cost");
        }
        return q;
    }
    
    public String getWeight(){
        String q = stats.get("Weight");
        if (q == null){
            System.out.println("This item does not contain a weight");
        }
        return q;
    }
    
    public String getDamage(){
        String q = stats.get("Damage");
        if (q == null){
            System.out.println("This item does not contain a damage");
        }
        return q;
    }    
    
    public UUID getID(){
        UUID q = null;
        try{
            q = UUID.fromString(stats.get("ID"));
            if (q == null){
                System.out.println("This item does not contain an id");
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("UUID invalid for Item : " + stats.get("Name") + "\nFailed UUID : " + stats.get("ID"));
        }

        return q;
    }
    
    public String toString(){
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
