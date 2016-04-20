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

    protected int maxHealthPoints;
    
    protected int armorClass;
    
    protected int[] stats;
    protected int[] statModifiers;
    
    protected int[] skillBonuses;
    
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
        int[] skillBonuses = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        this.skillBonuses = skillBonuses;
        // calculateStatModifiers(); // Will run method to calculate stat modifiers
        
        // entity_id = UUID.randomUUID();
        
    }
    
    
    // To do: setters and getters
    
    // Calculates stat modifiers and puts in statModifiers based on entity stats 
    // stored in stats field
    public void calculateStatModifiers() {
        // Not yet implemented
    }
}