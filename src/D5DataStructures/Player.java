// Player extends Entity to store all information about a player character that
// does not apply to all other beings in the game world; for instance, no
// Entity other than a player has skill proficiencies, so those are stored here.
// Will be the base class for storing player data.

package D5DataStructures;

import java.util.*;

public class Player extends Entity {

   
    public Player(              // Hahahahahahaha this is rediculous
            String Name,        // You can also just create a hashmap in the UI
            String Height,      // and pass it in, but you would need to make
            String Race,        // damn sure you don't miss any values
            String Subrace,
            String Class,
            String Alignment,
            String Sex,
            String Inventory,
            String HPBase,
            String HPConstitutionBonus,
            String HPRaceBonus,
            String XP,
            String Saves,
            String ArmorProficiencies,
            String WeaponProficiences,
            String ProficiencyBonus,
            String Strength,
            String Dexterity,
            String Constitution,
            String Intelligence,
            String Wisdom,
            String Charisma,
            String Acrobatics,
            String AnimalHandling,
            String Arcana,
            String Athletics,
            String Deception,
            String History,
            String Insight,
            String Intimidation,
            String Investigation,
            String Medicine,
            String Nature,
            String Perception,
            String Performance,
            String Persuasion,
            String Religion,
            String SleightOfHand,
            String Stealth,
            String Survival,
            String Language) {
        super();
    }
    
    public Player(HashMap<String, String> stats){
        super(stats);
    }
    
    public ArrayList<UUID> getInventoryUUIDs(){
        String unsplit_ids = stats.get("Inventory");
        
        if (unsplit_ids == null){
            System.out.println("This Player does not contain an Inventory");
            return null;
        }
        
        String[] split_ids = unsplit_ids.split(", ");
        
        ArrayList<UUID> ids = new ArrayList<UUID>();
        
        for(String s : split_ids){
            UUID uuid = null;
            try{
                uuid = UUID.fromString(s);
                ids.add(uuid);
            }
            catch (IllegalArgumentException e){
                System.out.println("UUID invalid for Player Inventory UUID : " + s);
            }
            
        }
        
        return ids;
    }
}
