// Entity stores data for any game-world being that the user
// wishes to store in the database, including players and their stats, as well
// as other combat-viable NPCs (enemies, allies, etc).  May also be extended to
// include non-combat-viable NPCs, in which case irrelevant stats would contain
// stock, placeholder or dummy values.

package D5DataStructures;

import java.util.*;

public class Entity {
    
    // Uniquie identifier for every entity, so that it can be referenced even if
    // it is not present
    protected UUID entityID;
    public UUID getID(){
        return entityID;
    }
    
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
    protected String name;
    // private Class classType;
    protected Race race;
    protected Align1 align1;
    protected Align2 align2;
    
    // Field for maximum HP
    protected int maxHealthPoints;
    
    // Field for AC; not implemented in constructor yet
    protected int armorClass;
    
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
    protected int[] stats;
    protected int[] statModifiers;
    
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
    public Entity(String source, String name, String size, String type,
            ArrayList<String> tags, Entity.Align1 align1, Entity.Align2 align2,
            int[] stats, int[] skillModifiers) {
        
        // Calls default constructor to make sure we initialize everything with
        // dummy values, since our real constructor does not yet take in all the
        // values we need to fill, and leaving fields uninitialized may create
        // errors.
        this();
        this.name = name;
        this.align1 = align1;
        this.align2 = align2;
        this.stats = stats;
        this.skillModifiers = skillModifiers;
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
            statModifiers[i] = (stats[i]/2) - 5;
        }
    }
    
    // To do: make this return more more meaningful data, for more thorough testing
    public String toString() {
        return name;
    }
}