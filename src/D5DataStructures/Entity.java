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
    protected UUID entityID;
    public UUID getID(){
        return entityID;
    }
    
    // Two enums for the two categories that make up alignment
    public enum Alignment1 { LAWFUL, NEUTRAL, CHAOTIC };
    public enum Alignment2 { GOOD, NEUTRAL, EVIL };
    // Basic D&D classes. CIVILIAN added to serve as a default.  May never see
    // use in a normal usage scenario.
    public enum Class { CIVILIAN, BARBARIAN, BARD, CLERIC, DRUID, FIGHTER, MONK, PALADIN, RANGER, ROUGE, SORCERER, WARLOCK, WIZARD };
    public enum Race { DRAGONBORN, DWARF, ELF, GNOME, HALF_ELF, HALF_ORC, HALFING, HUMAN, TIEFLING, AARAKOCRA, GENASI, GOLIATH };

    // Fields for basic info about the entity.  No field for type Class is included
    // since many Entities have no explicit Class (like Players).
    protected String name;
    // private Class classType;
    protected Race race;
    protected Alignment1 alignment1;
    protected Alignment2 alignment2;
    
    // Field for maximum HP
    protected int maxHealthPoints;
    
    // Field for AC
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
        alignment1 = Alignment1.NEUTRAL;
        alignment2 = Alignment2.NEUTRAL;
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
    
    // To do: constructor to populate from import file
    // Runs method to calculate stat modifiers from stats, after stats have been
    // entered
    // calculateStatModifiers();
    
    // To do: setters and getters
    
    
    // Calculates stat modifiers and puts in statModifiers based on entity stats 
    // stored in stats field
    public void calculateStatModifiers() {
        for(int i = 0; i < 6; i++) {
            statModifiers[i] = (stats[i]/2) - 5;
        }
    }
}