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
    private String playerSaves;
    private String playerName;
    private String playerNotes;
    private int playerHP;
    private int currentHP;
    /**
     * Default Constructor
     */
    public Player() {
        
        // Gives the player default entity values, a proficiency bonus of 0, and
        // proficiency in no skills.
        super();
        playerClass = Entity.Class.CIVILIAN;
        level = 0;
        exp = 0;
        profBonus = 0;
        
        // Ahh, don't know how many there are. How about 100, that sounds nice
        //There are 16 :) - Weston
        skillProfs = new boolean[16];
        
        Arrays.fill(skillProfs,false);
        playerName = "";
    }
    
    // Constructor that takes in all fields and generates a new player.
    // Calculates stat modifiers automatically
    public Player(String source, String name, int playerHP,
            ArrayList<String> tags, Entity.Align1 align1, Entity.Align2 align2,
            int[] stats,
            Entity.Class playerClass, Entity.Race playerRace, int level,
            int exp, int profBonus, boolean[] skillProfs, String playerName) {
        super(source, name, playerClass, playerRace, tags, align1, align2, stats);
        this.playerClass = playerClass;
        this.level = level;
        this.exp = exp;
        this.profBonus = profBonus;
        this.playerName = playerName;
        this.skillProfs = skillProfs;
        this.playerHP = playerHP;
        this.currentHP = playerHP;
        this.playerNotes = "";
        //determine saves based on playerClass
        determineSaves();
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
    public void setPlayerNotes(String playerNotes)
    {
        this.playerNotes = playerNotes;
    }
    public String getPlayerNotes()
    {
        return playerNotes;
    }
    public int getTotalHP()
    {
        return playerHP;
    }
    public void setTotalHP(int totalHP)
    {
        this.playerHP = totalHP;
        this.currentHP = totalHP;
    }
    public int getCurrentHP()
    {
        return currentHP;
    }
    public void setCurrentHP(int currentHP)
    {
        if(currentHP > playerHP)
        {
            currentHP = playerHP;
        }
        else
        {
           this.currentHP = currentHP; 
        }
        
    }
    /**
     * 
     * @return 
     */
    public String getSaves()
    {
        return playerSaves;
    }
    /**
     * 
     * @return 
     */
    public Entity.Class getPlayerClass() {
        return playerClass;
    }
    /**
     * 
     * @param playerClass 
     */
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
    
    public String getPlayerName()
    {
        return playerName;
    }
    
    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }
    /**
     * We can use this method to determine everything about each class and set it
     * right now it is just used to set saves to the player but we could do 
     * things like set class description, hit die, primary ability, proficiencies
     * etc...
     * 
     * This is a quick and dirty way to do saves this may be changed after 
     * prototype stage. For now we are just trying to ship a prototype. :)
     * @return 
     */
    private void determineSaves() {
        
        if(playerClass.equals(playerClass.BARBARIAN))
        {
            playerSaves = "STRENGTH & CONSTITUTION";
        }
        else if(playerClass.equals(playerClass.BARD))
        {
            playerSaves = "DEXTERITY & CHARISMA";
        }
        else if(playerClass.equals(playerClass.CIVILIAN))
        {
            playerSaves = "BEING IN EVERYONES WAY";
        }
        else if(playerClass.equals(playerClass.CLERIC))
        {
            playerSaves = "WISDOM & CHARISMA";
        }
        else if(playerClass.equals(playerClass.DRUID))
        {
            playerSaves = "INTELLIGENCE & WISDOM";
        }
        else if(playerClass.equals(playerClass.FIGHTER))
        {
            playerSaves = "STRENGTH & CONSTITUTION";
        }
        else if(playerClass.equals(playerClass.MONK))
        {
            playerSaves = "DEXTERITY & STRENGTH";
            if(level >= 14)
            {
                playerSaves = "ALL";
            }
        }
        else if(playerClass.equals(playerClass.PALADIN))
        {
            playerSaves = "WISDOM & CHARISMA";
        }
        else if(playerClass.equals(playerClass.RANGER))
        {
            playerSaves = "DEXTERITY & STRENGTH";
        }
        else if(playerClass.equals(playerClass.ROUGE))
        {
            playerSaves = "DEXTERITY & INTELLIGENCE";
        }
        else if(playerClass.equals(playerClass.SORCERER))
        {
            playerSaves = "CONSTITUTION & CHARISMA";
        }
        else if(playerClass.equals(playerClass.WARLOCK))
        {
            playerSaves = "WISDOM & CHARISMA";
        }
        else if(playerClass.equals(playerClass.WIZARD))
        {
            playerSaves = "INTELLIGENCE & WISDOM";
        }
    }
}
