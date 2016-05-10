// Enemy stores data for combat-viable NPCs the player may fight.

package D5DataStructures;

import java.util.*;

public class Enemy extends Entity {

    public Enemy(
            String Name,
            String ChallengeRating,
            String XP,
            String ArmorClassType,
            String ArmorClass,
            String Strength,
            String StrengthMod,
            String Dexterity,
            String DexterityMod,
            String Constitution,
            String ConstitutionMod,
            String Intelligence,
            String IntelligenceMod,
            String Wisdom,
            String WidsomMod,
            String Charisma,
            String CharismaMod,
            String HPDice,
            String HP) {
        super();
    }
    
    public Enemy(HashMap<String, String> stats){
        super(stats);
    }
    
}
