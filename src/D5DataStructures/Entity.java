package D5DataStructures;

import java.util.UUID;

public class Entity implements java.io.Serializable {
    
    // UUID for possible dependency and uniqueness resolution; implement later
    /*
    private UUID entity_id;
    public UUID getID(){
        return entity_id;
    }
    */

    public enum Alignment1 { LAWFUL, NEUTRAL, CHAOTIC };
    public enum Alignment2 { GOOD, NEUTRAL, EVIL };
    public enum Class { CIVILIAN, BARBARIAN, BARD, CLERIC, DRUID, FIGHTER, MONK, PALADIN, RANGER, ROUGE, SORCERER, WARLOCK, WIZARD };
    public enum Race { DRAGONBORN, DWARF, ELF, GNOME, HALF_ELF, HALF_ORC, HALFING, HUMAN, TIEFLING, AARAKOCRA, GENASI, GOLIATH };

    protected String name;
    // private Class classType;
    protected Race race;
    protected Alignment1 alignment1;
    protected Alignment2 alignment2;

    protected int maxHealthPoints;
    
    protected int armorClass;
    
    protected int[] stats;
    protected int[] statModifiers;
    
    
    public Entity(){
        name = "";
        race = Race.HUMAN;
        alignment1 = Alignment1.NEUTRAL;
        alignment2 = Alignment2.NEUTRAL;
        maxHealthPoints = 0;
        armorClass = 0;
        
        int[] stats = {10,10,10,10,10,10};
        this.stats = stats;
        int[] statModifiers = {0,0,0,0,0,0};
        this.statModifiers = statModifiers;
        // calculateStatModifiers(); // Will run method to calculate stat modifiers
        
        // entity_id = UUID.randomUUID();
        
    }
    
    // Calculates stat modifiers and puts in statModifiers based on entity stats 
    // stored in stats field
    public void calculateStatModifiers() {
        // Not yet implemented
    }
}