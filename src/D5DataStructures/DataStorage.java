// Maintains all entries in the databases while the program is running.  Can
// be serialized to store all data currently in program.

package D5DataStructures;

import D5DataStructures.DraftClasses.Encounter;
import D5DataStructures.DraftClasses.*;
import java.util.*;
import java.io.*;

public class DataStorage implements java.io.Serializable {
    
    // To consider for future:
    // If we use ArrayLists, we have to implemenet sorting by different variables
    // of our Enemies, Items, Encounters, etc. manually, and write our own sorting
    // algorithms.  But I do not know of a data structure that can dynamically sort
    // by more than one thing anyways.
    private ArrayList<Enemy> enemyList;
    private ArrayList<Player> playerList;
    private ArrayList<Player> npcList;
    private ArrayList<Item> itemList;
    private ArrayList<Encounter> encounterList;
    
    // Maps of UUIDs for existing entities and items to pointers to their object
    // and data. Allows resolution of references to entities and items that may
    // not have been imported yet.
    private HashMap<UUID, Entity> entityRefMap;
    private HashMap<UUID, Item>   itemRefMap;
    
    // Default constructor; initializes a new empty database.
    public DataStorage() {
        enemyList = new ArrayList<Enemy>();
        playerList = new ArrayList<Player>();
        npcList = new ArrayList<Player>();
        itemList = new ArrayList<Item>();
        encounterList = new ArrayList<Encounter>();
        entityRefMap = new HashMap<UUID, Entity>();
        itemRefMap = new HashMap<UUID, Item>();
    }
    
    // Takes in a String representing the file path of a CSV file
    // that contains enemies to be imported.
    // Adds enemies found in the file to the existing database of enemies.
    // To consider: where to perform exception handling.
    public void addEnemiesFromCSV(String importFilePath) throws FileNotFoundException, IOException {
        enemyList.addAll(CSVIO.importEnemiesFromCSV(importFilePath));
    }
    
    public void addMagicItemsFromCSV(String importFilePath) throws FileNotFoundException, IOException {
        itemList.addAll(CSVIO.importMagicItemsFromCSV(importFilePath));
    }
    
    // Adds a new player
    public void addPlayer(Player p) {
        playerList.add(p);
    }
    
    // Adds a new NPC
    public void addNPC(Player npc) {
        npcList.add(npc);
    }
    
    // Methods to return the lists of entries currently in database.  The UI will
    // need these.
    // Possible: doesn't make sense to return the entire database each time, so 
    // modify to only return a single element based on index given as argument.
    public ArrayList<Enemy> getEnemyList() {
        return enemyList;
    }

    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public Iterable<Player> getPlayers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
