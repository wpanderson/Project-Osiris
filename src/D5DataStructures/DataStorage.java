// Maintains all entries in the databases while the program is running.  Can
// be serialized to store all data currently in program.

package D5DataStructures;

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
    private ArrayList<Item> itemList;
    private ArrayList<Encounter> encounterList;
    
    // Item pointer map, allows UI to populate item data for the selected ents
    private HashMap<UUID, Item>   itemRefMap;
    
    // Default constructor; initializes a new empty database.
    public DataStorage() {
        enemyList = new ArrayList<Enemy>();
        playerList = new ArrayList<Player>();
        itemList = new ArrayList<Item>();
        encounterList = new ArrayList<Encounter>();
        itemRefMap = new HashMap<UUID, Item>();
    }
    
    // CSV import functions take the path to the CSV and
    // then parse the data into their respective data types generically
    public void addEnemiesFromCSV(String filePath){
        try{
            enemyList.addAll(CSVIO.importEnemies(filePath));
        }
        catch (FileNotFoundException f){
            System.out.println("File not found : " + filePath);
            System.out.println("Dump: \n" + f);
        }
        catch (IOException i){
            System.out.println(i);
        }
    }
    public void addPlayersFromCSV(String filePath) throws FileNotFoundException {
        try{
            playerList.addAll(CSVIO.importPlayers(filePath));
        }
        catch (FileNotFoundException f){
            System.out.println("File not found : " + filePath);
            System.out.println("Dump: \n" + f);
        }
        catch (IOException i){
            System.out.println(i);
        }
    }
    public void addItemsFromCSV(String filePath) throws FileNotFoundException {
        try{
            itemList.addAll(CSVIO.importItems(filePath));
            for (Item i: itemList){
                itemRefMap.put(i.getID(), i);
            }
        }
        catch (FileNotFoundException f){
            System.out.println("File not found : " + filePath);
            System.out.println("Dump: \n" + f);
        }
        catch (IOException i){
            System.out.println(i);
        }
        
    }
    
    // Add single data values into their respective containers
    public void addEnemy(Enemy e){
        enemyList.add(e);
    }
    public void addItem(Item i){
        itemList.add(i);
    }
    public void addPlayer(Player p){
        playerList.add(p);
    }
    
    // Return the entire data containers for iteration, serching, whatever
    public ArrayList<Enemy> getEnemyList() {
        return enemyList;
    }

    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }
    
    // Return a list of items matching a list of UUID's. Single items are
    // just fine too, just pass it an array of 1 UUID
    public ArrayList<Item> getItemsMatchingIDs(ArrayList<UUID> ids){
        ArrayList<Item> items = new ArrayList<Item>();
        
        for (UUID u: ids){
            Item i = itemRefMap.get(u);
            if (i == null){
                System.out.println("No item in instance matching : " + u);
                System.out.println("Perhaps it hasn't been loaded yet?");
            }
            else{
                items.add(i);
            }
        }
        
        return items;
    }
    
    // Get the player value matching the given name. Name must be exact!!
    public Player getPlayerByName(String name){
        for (Player p : playerList){
            if (p.getStat("Name").equals(name)){
                return p;
            }
        }
        System.out.println("No player found with name : " + name);
        return null;
    }
    
    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }
}
