// Enemy stores data for combat-viable NPCs the player may fight.

package D5DataStructures;

import java.util.*;

public class Enemy extends Entity {
    
    // Indicates the enemy's contribution to the challenge rating of an enemy party.
    private double challenge;
    
    // Indicates how much experience the enemy will yield when defeated.
    private int expValue;
    
    // Default constructor; uses dummy values, for initialization only
    public Enemy() {
        super();
        challenge = 0;
        expValue = 0;
    }
    
    public Enemy(String source, String name, String size, String type,
            ArrayList<String> tags, Entity.Align1 align1, Entity.Align2 align2,
            
            // These are unique to Enemy
            double challenge, int expValue,
                    
            int[] stats, int[] skillModifiers) {
        
        super(source, name, size, type, tags, align1, align2, stats, skillModifiers);
        this.challenge = challenge;
        this.expValue = expValue;
        calculateStatModifiers();
    }
    
    // Automatically sets or overwrites the Enemy's challenge rating with a value
    // determined based on its possessed stats.
    public void determineChallenge() {
        
    }

    public double getChallenge() {
        return challenge;
    }

    public void setChallenge(double challenge) {
        this.challenge = challenge;
    }

    public int getExpValue() {
        return expValue;
    }

    public void setExpValue(int expValue) {
        this.expValue = expValue;
    }
}
