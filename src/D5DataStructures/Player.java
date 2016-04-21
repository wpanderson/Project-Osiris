// Player extends Entity to store all information about a player character that
// does not apply to all other beings in the game world; for instance, no
// Entity other than a player has skill proficiencies, so those are stored here.
// Will be the base class for storing player data.

package D5DataStructures;

import java.util.*;

public class Player extends Entity {
    
    // Field for player's class. Uses enum defined in superclass Entity
    protected Entity.Class playerClass;
    
    // Fields which represent the total exp the player possesses, and their current
    // level based on that value.
    protected int level;
    protected int exp;
    
    // Field for proficiency bonus.
    protected int profBonus;
    
    // Arrays that record which skills a player is proficient in.
    // Skill bonuses are implemented in the superclass, since all entities
    // have skill bonuses (although they are calculated in different ways
    // for enemies and players).
    // The skill bonuses can be calculated if we know a player's
    // stats, proficiency bonus and which skills they are proficient in.
    // (Possible exceptions for rogues and other classes with abilities that give
    // extra bonuses to skills.  Will handle these cases later.)
    protected boolean[] skillProfs;
    
    // Default constructor; uses dummy values for initialization only
    public Player() {
        
        // Gives the player default entity values, a proficiency bonus of 0, and
        // proficiency in no skills.
        super();
        playerClass = Entity.Class.CIVILIAN;
        level = 0;
        exp = 0;
        profBonus = 0;
        Arrays.fill(skillProfs,false);
    }
    
    // To do: constructor to populate from import file.  Player's will take in
    // most things normally, but will not take in skill modifiers; instead, these
    // will be calculated from base stats and proficiency bonus.  Will use a
    // seperate method that does these calculations, since skill modifiers will
    // need to be recalculated every time base stats change, not just on construction.
    
    
    // To do: setters and getters
    
    // Checks if the player's level needs to be updated based on their current
    // exp value, and updates their level if necessary. Returns a boolean
    // representing whether the character's level was changed.
    // Not yet functional
    public boolean levelUpCheck() {
        // To do: implement logic (must look up level calculation based on exp)
        return false;
    }
}
