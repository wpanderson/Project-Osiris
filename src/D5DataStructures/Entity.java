// Entity stores data for any game-world being that the user
// wishes to store in the database, including players and their stats, as well
// as other combat-viable NPCs (enemies, allies, etc).  May also be extended to
// include non-combat-viable NPCs, in which case irrelevant stats would contain
// stock, placeholder or dummy values.

package D5DataStructures;

import java.util.*;

public class Entity implements java.io.Serializable {
    
    // Uniquie identifier for every entity, so that it can be referenced even if
    // it is not present
    private UUID entityID;
  
    // Two enums for the two categories that make up alignment
    // To do: move enums and other custom variables for enitre app to inedepentent
    // class for organization.
    public enum Align1 { LAWFUL, NEUTRAL, CHAOTIC };
    public enum Align2 { GOOD, NEUTRAL, EVIL, SCIENTIFIC };
    // Basic D&D classes. CIVILIAN added to serve as a default.  May never see
    // use in a normal usage scenario.
    public enum Class { CIVILIAN, BARBARIAN, BARD, CLERIC, DRUID, FIGHTER, MONK, PALADIN, RANGER, ROUGE, SORCERER, WARLOCK, WIZARD };
    public enum Race { DRAGONBORN, DWARF, ELF, GNOME, HALF_ELF, HALF_ORC, HALFING, HUMAN, TIEFLING, AARAKOCRA, GENASI, GOLIATH };

    // Fields for basic info about the entity.  No field for type Class is included
    // since many Entities have no explicit Class (like Players).
    // Race is not yet implemented in nondefault constructor for Entities,
    // since our test database of enemies does not include their race values.
    private String name;
    // private Class classType;
    private Class entityClass;
    private Race race;
    protected Align1 align1;
    protected Align2 align2;
    
    // Field for maximum HP
    private int maxHealthPoints;
    
    // Field for AC; not implemented in constructor yet
    private int armorClass;
    
    // Two arrays (both always initialized with a size of 6).  These store stats
    // and the stat modifiers.  Stat modifiers can be determined based on stats
    // at any time.  Each index in the array (0-5) maps to a specific stat.
    // 0 - Strength
    // 1 - Dexterity
    // 2 - Constitution
    // 3 - Intelligence
    // 4 - Wisdom
    // 5 - Charisma
    // This implementation improves ease of calculation of stat modifiers from
    // actual stats by enabling use of a loop, since modifiers are calculated the
    // same way for each stat.
    private int[] stats;
    private int[] statModifiers;
    
    // An array to store skill modifier values.  Array always size 18 (number of 
    // skills present in D&D).  Like for stats, each index maps to a specific
    // skill; these mappings are consistent for all arrays that store data about
    // skills (see Player class).  Will be populated differently in child classes
    // since skill modifiers are determined differently for Players (based on
    // stats and proficiencies) and Enemies/NPCs (usually predetermined value).
    protected int[] skillModifiers;
    
    protected ArrayList<UUID> inventory;
    
    // Default constructor; sets all entity values to defaults, many of which make
    // little sense from a D&D standpoint. For initialization only.
    public Entity(){
        
        // Gives the entity an empty name, makes it a human, gives neutral-neutral alignment,
        // and sets AC/max HP to 0.
        name = "";
        race = Race.HUMAN;
        align1 = Align1.NEUTRAL;
        align2 = Align2.NEUTRAL;
        maxHealthPoints = 0;
        armorClass = 0;
        
        // Gives the entity base stats that are all tens, with skill bonuses that
        // are all 0.
        int[] stats = {10,10,10,10,10,10};
        this.stats = stats;
        int[] statModifiers = {0,0,0,0,0,0};
        this.statModifiers = statModifiers;
        int[] skillModifiers = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        this.skillModifiers = skillModifiers;
        
        // entity_id = UUID.randomUUID();
    }
    // Constructor for populating all values of an entity
    // Notes:
    // Fields do not yet exist for all data we want to import.  The constructor
    // supports input of some values we do not store yet. (source, size, type, tags
    // Size and type of an entity will likely be represented by enums later,
    // since there are presumably a finite number of predetermined sizes and types.
    // However, we may also want to allow for the possibility that the player
    // chooses to add their own size or type.
    // Question: should validation/interpretation of text into other data types
    // be done here or with logic that reads csv as much as possible?  Ryan leans
    // towards putting it with the reading logic.
    public Entity(String source, String name, Entity.Class entityClass,
            Entity.Race entityRace,
            ArrayList<String> tags, Entity.Align1 align1, Entity.Align2 align2,
            int[] stats) {
        
        // Calls default constructor to make sure we initialize everything with
        // dummy values, since our real constructor does not yet take in all the
        // values we need to fill, and leaving fields uninitialized may create
        // errors.
        this();
        this.name = name;
        this.entityClass = entityClass;
        this.race = entityRace;
        this.align1 = align1;
        this.align2 = align2;
        this.stats = stats;
        // Comment since will be initialized by child
        // this.skillModifiers = skillModifiers;
        calculateStatModifiers();
    }
    
    // To do: constructor to populate from import file
    // Runs method to calculate stat modifiers from stats, after stats have been
    // entered
    // calculateStatModifiers();
    
    // To do: setters and getters
    
    
    // Calculates stat modifiers and puts in statModifiers based on entity stats 
    // stored in stats field.  Final to prevent overriding, causing automatic
    // calculation and storage of stat modifiers Entity does not consider valid.
    public final void calculateStatModifiers() {
        for(int i = 0; i < 6; i++) {
            getStatModifiers()[i] = (getStats()[i]/2) - 5;
        }
    }
    
    // To do: make this return more more meaningful data, for more thorough testing
    public String toString() {
        return getName();
    }
    /**
     * Get the first half of the alignment Lawful, Neutral, or Chaotic
     * 
     * @return Alignment: Lawful, Neutral, Chaotic
     */
    public Align1 getAlign1()
    {
        return align1;
    }
    /**
     * 
     * @param align1 
     */
    public void setAlign1(Align1 align1)
    {
        this.align1 = align1;
    }
    /**
     * Return second half of the alignment. Good, Neutral, Evil
     * @return align2 Good, Neutral, Evil
     */
    public Align2 getAlign2()
    {
        return align2;
    }
    /**
     * Set alignment 2
     * @param align2 
     */
    public void setAlign2(Align2 align2)
    {
        this.align2 = align2;
    }
    /**
     * Get string representation of align1 and align2, which is appropriate to
     * display on mainGUI
     * @return String representation of alignment
     */
    public String getAlignment()
    {
        return align1.toString() + " " + align2.toString();
    }
    /**
     * Return UUID of an Entity
     * @return UUID entityID
     */
    public UUID getEntityID() {
        return entityID;
    }
    /**
     * Return name of the Entity
     * @return String name
     */
    public String getName() {
        return name;
    }
    /**
     * Set name of Entity
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Get the race of the Entity
     * @return Race race
     */
    public Race getRace() {
        return race;
    }
    /**
     * Set the race of the Entity
     * @param race 
     */
    public void setRace(Race race) {
        this.race = race;
    }
    /**
     * get total HP of the Entity.
     * @return int maxHealthPoints
     */
    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }
    /**
     * Set maximum health points of Entity
     * @param maxHealthPoints 
     */
    public void setMaxHealthPoints(int maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }
    /**
     * get armor class of Entity
     * @return int armorClass
     */
    public int getArmorClass() {
        return armorClass;
    }
    /**
     * set armor class of the Entity
     * @param armorClass 
     */
    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }
    /**
     * get stats of the entity
     * @return int[] stats
     */
    public int[] getStats() {
        return stats;
    }
    /**
     * 
     * @param stats 
     */
    public void setStats(int[] stats) {
        this.stats = stats;
    }
    /**
     * 
     * @return int[] statModifiers
     */
    public int[] getStatModifiers() {
        return statModifiers;
    }
    /**
     * 
     * @param statModifiers 
     */
    public void setStatModifiers(int[] statModifiers) {
        this.statModifiers = statModifiers;
    }
    /**
     * 
     * @return int[] skillModifiers
     */
    public int[] getSkillModifiers() {
        return skillModifiers;
    }
    /**
     * 
     * @param skillModifiers 
     */
    public void setSkillModifiers(int[] skillModifiers) {
        this.skillModifiers = skillModifiers;
    }
}