// Enemy stores data for combat-viable NPCs the player may fight.

package D5DataStructures;

import java.util.*;

public class Enemy extends DataItem {

    enum Enemy_Stat_Options { 
        source, name, size, type, tags, alignment,
        challenge, xp, strength, dexterity, constitution,
        intelligence, wisdom, charisma, acrobatics,
        animal_handling, arcana, athletics, aeception,
        history, insight, intimidation, investigation,
        medicine, nature, perception, performance, persuasion,
        religion, sleight_of_hand, stealth, survival, hit_points, damage
    }

    public Enemy(){
        super();
    }
    
    public Enemy(HashMap<String, String> stats){
        super(stats);
    }

    @Override
    protected void validateValues() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
