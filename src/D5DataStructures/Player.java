// Player extends Entity to store all information about a player character that
// does not apply to all other beings in the game world; for instance, no
// Entity other than a player has skill proficiencies, so those are stored here.
// Will be the base class for storing player data.

package D5DataStructures;

import java.util.*;

public class Player extends Entity {
    
    // Field for player's class. Uses enum defined in superclass Entity
    private Entity.Class playerClass;
    
    // Fields which represent the total exp the player possesses, and their current
    // level based on that value.
    private int level;
    private int exp;
    
    // Field for proficiency bonus.
    private int profBonus;
    
    // Arrays that record which skills a player is proficient in.
    // Skill bonuses are implemented in the superclass, since all entities
    // have skill bonuses (although they are calculated in different ways
    // for enemies and players).
    // The skill bonuses can be calculated if we know a player's
    // stats, proficiency bonus and which skills they are proficient in.
    // (Possible exceptions for rogues and other classes with abilities that give
    // extra bonuses to skills.  Will handle these cases later.)
    private boolean[] skillProfs;
    
    private String playerName;
    
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
        playerName = "";
    }
    
    // Constructor that takes in all fields and generates a new player.
    // Calculates stat modifiers automatically
    public Player(String source, String name, String size, String type,
            ArrayList<String> tags, Entity.Align1 align1, Entity.Align2 align2,
            int[] stats, int[] skillModifiers,
            
            Entity.Class playerClass, int level,
            int exp, int profBonus, boolean[] skillProfs, String playerName) {
        super(source, name, size, type, tags, align1, align2, stats);
        this.playerClass = playerClass;
        this.level = level;
        this.exp = exp;
        this.profBonus = profBonus;
        // calculateSkillModifiers();
        calculateStatModifiers();
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


    public Entity.Class getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(Entity.Class playerClass) {
        this.playerClass = playerClass;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getProfBonus() {
        return profBonus;
    }

    public void setProfBonus(int profBonus) {
        this.profBonus = profBonus;
    }

    public boolean[] getSkillProfs() {
        return skillProfs;
    }

    public void setSkillProfs(boolean[] skillProfs) {
        this.skillProfs = skillProfs;
    }
}
