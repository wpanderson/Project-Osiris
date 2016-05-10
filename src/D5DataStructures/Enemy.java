// Enemy stores data for combat-viable NPCs the player may fight.

package D5DataStructures;

import java.util.*;

public class Enemy extends Entity {
    
    // Indicates the enemy's contribution to the challenge rating of an enemy party.
    protected double challenge;
    
    // Indicates how much experience the enemy will yield when defeated.
    protected int expValue;
    
    // Default constructor; uses dummy values, for initialization only
    public Enemy() {
        super();
        challenge = 0;
        expValue = 0;
    }
    
    public Enemy(HashMap<String, String> stats){
        super(stats);
    }
    
    // Automatically sets or overwrites the Enemy's challenge rating with a value
    // determined based on its possessed stats.
    public void determineChallenge() {
        
    }
}
