/**
 * Data storage class for Items read in from CSV and Serialized files.
 * 
 */
package D5DataStructures;

import java.util.ArrayList;
/**
 *
 * @author Wes Anderson
 */
public class Item implements java.io.Serializable { 
    public enum Type {GENERIC, ARMOR, WEAPON, POTION, RING, ROD, SCROLL, STAFF,
                        WAND, WONDROUS, MARTIAL_MELEE, MARTIAL_RANGED,
                        SIMPLE_MELEE, SIMPLE_RANGED};
    public enum Rarity {UNCOMMON, COMMON, RARE, VERY_RARE, LEGENDARY};
    public enum Weapon_Type { AMMUNITION, FINESSE, HEAVY, LIGHT, LOADING, RANGE, REACH, SPECIAL, 
                            THROWN, TWOHANDED, VERSITILE , NULL};
    private ArrayList<Weapon_Type> weaponProperties;
    
    private String name;
    private int cost;
    private double weight;
    private Type type;
    private String source;
    private Rarity rarity;
    private boolean attunememt;
    private String notes;
    private String damageType;
    private String damage;
    private String range;
    
    /**
     * generic item constructor
     * 
     * @param name
     * @param cost
     * @param weight
     * @param type
     */
    public Item(String name, int cost, double weight, Type type)
    {
        this.rarity = Item.Rarity.COMMON;
        this.name = name;
        this.cost = cost;
        this.weight = weight;
        this.type = Item.Type.GENERIC;
    }
    /**
     * Magic Item constructor. 
     * @param source
     * @param name
     * @param type
     * @param rarity
     * @param attunement
     * @param notes
    */
    public Item(String source, String name, Type type, Rarity rarity,
            boolean attunement, String notes)
    {
        this.source = source;
        this.name = name;
        this.type = type;
        this.rarity = rarity;
        this.attunememt = attunement;
        this.notes = notes;
    }
    
    /**
     * Weapon Item constructor
     * @param type
     * @param name
     * @param cost
     * @param damage
     * @param damageType
     * @param weight
     * @param weaponProperties
     * @param range 
     */
    public Item(Type type, String name, int cost, String damage, 
                String damageType, double weight, 
                ArrayList<Weapon_Type> weaponProperties, String range){
        this.rarity = Item.Rarity.COMMON;
        this.type = Item.Type.WEAPON;
        this.name = name;
        this.cost = cost;
        this.damage = damage;
        this.damageType = damageType;
        this.weight = weight;
        this.weaponProperties = weaponProperties;
        this.range = range;    
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @return the type
     */
    public Type getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * @return the source
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source the source to set
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return the rarity
     */
    public Rarity getRarity() {
        return rarity;
    }

    /**
     * @param rarity the rarity to set
     */
    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    /**
     * @return the attunememt
     */
    public boolean isAttunememt() {
        return attunememt;
    }

    /**
     * @param attunememt the attunememt to set
     */
    public void setAttunememt(boolean attunememt) {
        this.attunememt = attunememt;
    }

    /**
     * @return the notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * @param notes the notes to set
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }
    
     /**
     * @return the damageType
     */
    public String getDamageType() {
        return damageType;
    }

    /**
     * @param damageType the damageType to set
     */
    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }
    
     /**
     * @return the damage
     */
    public String getDamage() {
        return damage;
    }

    /**
     * @param damage the damage to set
     */
    public void setDamage(String damage) {
        this.damage = damage;
    }

    /**
     * @return the range
     */
    public String getRange() {
        return range;
    }

    /**
     * @param range the range to set
     */
    public void setRange(String range) {
        this.range = range;

    }
    
     /**
     * @return the weaponProperties
     */
    public ArrayList<Weapon_Type> getWeaponProperties() {
        return weaponProperties;
    }

    /**
     * @param weaponProperties the weaponProperties to set
     */
    public void setWeaponProperties(ArrayList<Weapon_Type> weaponProperties) {
        this.weaponProperties = weaponProperties;
    }
    
     /**
     * @return A string representing the Item
     */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        if (type == Item.Type.GENERIC){
            sb.append("\nName : " + getName());
            sb.append("\nCost : " + getCost() + " cp");
            sb.append("\nWeight : " + getWeight());
        }
        
        else if (type == Item.Type.WEAPON){
            sb.append("\nName : " + getName());
            sb.append("\nCost : " + getCost() + " cp");
            sb.append("\nDamage : " + getDamage());
            sb.append("\nDamage Type : " + getDamageType());
            sb.append("\nWeight : " + getWeight());
            sb.append("\nRange : " + getRange());
        }
        else{
            sb.append("\nSource : " + getSource());
            sb.append("\nName : " + getName());
            sb.append("\nType : " + getType());
            sb.append("\nRarity : " + getRarity());
            sb.append("\nAttunement : " + isAttunememt());
            sb.append("\nNotes : " + getNotes());
        }
        return sb.toString();
    }
    
}
