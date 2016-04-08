
package Test_Of_Possible_Data_Structures;

import java.util.ArrayList;

public class Item implements java.io.Serializable {
    
    // Item class takes care of most, if not all player held items that you
    // will encounter. In order to serialize this and store it in a file, there
    // will need to be some way to assign ownership of the item.
    
    // Easiest way to do this that I can think of is store all items in a hashmap
    // indexed by their id. Then storing and reading back the data will be super easy.
    // Entities will just have a list of id's that they "own" which will serialize
    // very nicely as well.
    
    
    
    public enum Type { AMMUNITION, FINESSE, HEAVY, LIGHT, LOADING, RANGE, REACH, SPECIAL, 
                       THROWN, TWOHANDED, VERSITILE };
    
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
    
    public Item (String name,
                 int cost,
                 int weight,
                 Dice_Option damage,
                 int normal_range,
                 int max_range,
                 ArrayList<Type> item_properties){
    }
    
    public String ListItemProperties(){
        String list = new String();
        for (Type t: item_properties){
            list += t + ", ";
        }
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
