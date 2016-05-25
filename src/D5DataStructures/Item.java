/**
 * Data storage class for Items read in from CSV and Serialized files.
 * 
 */
package D5DataStructures;

/**
 *
 * @author Wes Anderson
 */
public class Item { 
    public enum Type {GENERIC, ARMOR, WEAPON, POTION, RING, ROD, SCROLL, STAFF,
                        WAND, WONDROUS};
    public enum Rarity {UNCOMMON, COMMON, RARE, VERY_RARE, LEGENDARY};
    
    private String name;
    private int cost;
    private double weight;
    private Type type;
    private String source;
    private Rarity rarity;
    private boolean attunememt;
    private String notes;
    
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
        this.name = name;
        this.cost = cost;
        this.weight = weight;
        this.type = type;
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
     * @return A string representing the Item
     */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nSource : " + getSource());
        sb.append("\nName : " + getName());
        sb.append("\nType : " + getType());
        sb.append("\nRarity : " + getRarity());
        sb.append("\nAttunement : " + isAttunememt());
        sb.append("\nNotes : " + getNotes());
        
        return sb.toString();
    }
    
}
