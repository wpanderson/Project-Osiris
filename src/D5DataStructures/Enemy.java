// Enemy stores data for combat-viable NPCs the player may fight.

package D5DataStructures;

import java.util.*;

public class Enemy extends Entity {

    public Enemy(){
        super();
    }
    
    public Enemy(HashMap<String, String> stats){
        super(stats);
    }
    
}
