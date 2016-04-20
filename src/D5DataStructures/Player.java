package D5DataStructures;

import java.util.*;

public class Player extends Entity {
    
    // Field for player's class. Uses enum defined in superclass Entity
    protected Entity.Class playerClass;
    
    // Field for proficiency bonus.
    protected int profBonus;
    // Arrays that record which skills a player is proficient in.
    // Skill bonuses will be implemented in the superclass, since all entities
    // have skill bonuses (although they are calculated in different ways
    // for enemies and players).
    // The skill bonuses can be calculated if we know a player's
    // stats, proficiency bonus and which skills they are proficient in.
    // (Possible exceptions for rogues and other classes with abilities that give
    // extra bonuses to skills.  Will handle these cases later.)
    protected boolean[] skillProfs;
    
    // Default constructor; for initialization only
    public Player() {
        
        // Gives the player default entity values, a proficiency bonus of 0, and
        // proficiency in no skills.
        super();
        profBonus = 0;
        Arrays.fill(skillProfs,false);
    }
    
    // To do: setters and getters
    
}
