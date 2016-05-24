// TENTATIVE; needs cleanup
// Item class represents one type of item that can be possessed by an Entity.
// Ownership will be handled by having the owner's inventory
// reference a specific item, either by UUID or with a pointer.  The owner's
// inventory may also handle the quantity of an item possessed.

package D5DataStructures.DraftClasses;

import java.util.ArrayList;
import java.util.UUID;

public class Item implements java.io.Serializable {
    

    
    private UUID itemID;
    private UUID getID(){
        return itemID;
    }

    
    public enum Type { AMMUNITION, FINESSE, HEAVY, LIGHT, LOADING, RANGE, REACH, SPECIAL, 
                       THROWN, TWOHANDED, VERSITILE };
    
    // I don't really want to tear into this class. There needs to be some thinking into
    // How we're going to display Items as there are 3 different types + the generic one as well
    // So I'm just gonna plop this in here so I can finish generation
    public enum Magic_Item_Type { WONDROUS, WEAPON, WAND, STAFF, SCROLL, ROD, RING, POTION, ARMOR};
    
    public enum Rarity { COMMON, UNCOMMON, RARE, VERYRARE, LEGENDARY };
    
    // To do: better enumeration system for dice that is universal accross all
    // classes in program.
    public enum Dice_Option { ONE_D_FOUR, ONE_D_SIX, ONE_D_EIGHT, ONE_D_TEN, ONE_D_TWELVE, ONE_D_TWENTY,
                              TWO_D_FOUR, TWO_D_SIX, TWO_D_EIGHT, TWO_D_TEN, TWO_D_TWELVE, TWO_D_TWENTY,
                              THR_D_FOUR, THR_D_SIX, THR_D_EIGHT, THR_D_TEN, THR_D_TWELVE, THR_D_TWENTY,
                              NULL };
    
    ArrayList<Type> item_properties;
    
    private int normal_range;
    private int max_range;
    
    private String name;
    private int cost_cp;
    private int weight_lb;
    private Dice_Option damage;
    
    private Rarity rarity;
    
    public Item (String name,
                 int cost,
                 int weight,
                 Dice_Option damage,
                 int normal_range,
                 int max_range,
                 ArrayList<Type> item_properties){
        
        
    }
    
    public Item (String raw_data){
        // From file data constructor
    }
    
    public String ListItemProperties(){
        String list = new String();
//        for (Type t: item_properties){
//            list += t + ", ";
//        }
        list += name + " : " + '\n';
        return list;
    }
    public ArrayList<Type> getItemProperties(){
        return item_properties;
    }
    
    public int getMaxRange(){
        return max_range;
    }
    
    public int getNormalRange(){
        return normal_range;
    }
    
    public String getName(){
        return name;
    }
    
    public int getCost(){
        return cost_cp;
    }
    
    public int getWeight(){
        return weight_lb;
    }
    
    public Dice_Option getDamage(){
        return damage;
    }    
}
