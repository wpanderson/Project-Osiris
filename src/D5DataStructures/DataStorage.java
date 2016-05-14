// Maintains all entries in the databases while the program is running.

package D5DataStructures;

import java.util.*;
import java.io.*;

public class DataStorage {
    
    // Containers for the respective data types
    private ArrayList<? super Enemy> enemyList;
    private ArrayList<? super Player> playerList;
    private ArrayList<? super Item> itemList;
    private ArrayList<? super Encounter> encounterList;
    
    // Item pointer map, allows UI to populate item data for the selected ents
    private HashMap<UUID, Item>   itemRefMap;
    private HashMap<UUID, Player> playerRefMap;
    
    // Default constructor; initializes a new empty database.
    public DataStorage() {
        enemyList = new ArrayList<Enemy>();
        playerList = new ArrayList<Player>();
        itemList = new ArrayList<Item>();
        encounterList = new ArrayList<Encounter>();
        
        itemRefMap = new HashMap<UUID, Item>();
        itemRefMap = new HashMap<UUID, Item>();
    }
    
    public DataStorage(String itemsPath, String playersPath){
        this();
        // No monster path was given, defaults
        addEnemiesFromCSV("Monsters_DB.csv");
    
        addPlayersFromCSV(playersPath);
        addItemsFromCSV(itemsPath);
    }
    
    public DataStorage(String itemsPath, String playersPath, String monstersPath){
        this();
       
        addEnemiesFromCSV(monstersPath);
        addPlayersFromCSV(playersPath);
        addItemsFromCSV(itemsPath);
    }
    
    // CSV import functions take the path to the CSV and
    // then parse the data into their respective data types generically
    public void addEnemiesFromCSV(String filePath){
        try{
            enemyList = CSVIO.importDataItems(filePath, DataItem.Data_Type.ENEMY);
        }
        catch (FileNotFoundException f){
            System.out.println("File not found : " + filePath);
            System.out.println("Dump: \n" + f);
        }
    }
    public void addPlayersFromCSV(String filePath){
        try{
            playerList = CSVIO.importDataItems(filePath, DataItem.Data_Type.PLAYER);
        }
        catch (FileNotFoundException f){
            System.out.println("File not found : " + filePath);
            System.out.println("Dump: \n" + f);
        }
    }
    public void addItemsFromCSV(String filePath){
        try{
            itemList = CSVIO.importDataItems(filePath, DataItem.Data_Type.ITEM);

            for (Object i: itemList){
                Item q = (Item) i;
                itemRefMap.put(q.getID(), q);
            }
        }
        catch (FileNotFoundException f){
            System.out.println("File not found : " + filePath);
            System.out.println("Dump: \n" + f);
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
    // Really janky casting, but hey, you do what you do for dat polymorphic love
    public ArrayList<Enemy> getEnemyList() {
        ArrayList<Enemy> e = (ArrayList<Enemy>)enemyList;
        return e;
    }

    public ArrayList<Player> getPlayerList() {
        ArrayList<Player> p = (ArrayList<Player>)playerList;
        return p;
    }

    public ArrayList<Item> getItemList() {
        ArrayList<Item> i = (ArrayList<Item>)itemList;
        return i;
    }
    
    public ArrayList<Encounter> getEncounterList() {
        ArrayList<Encounter> e = (ArrayList<Encounter>)encounterList;
        return e;
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
    // Again groos-ass casting shit
    public Player getPlayerByName(String name){
        for (Object q : playerList){
            try{
                Player p = (Player)q;
                if (p.getStat("Name").equals(name)){
                    return p;
                }
            }
            catch(ClassCastException e){ 
                System.out.println(e);
            }
        }
        System.out.println("No player was found with name : " + name);
        return null;
    }
    
    public Enemy getEnemyByName(String name){
        for (Object q : enemyList){
            try{
                Enemy e = (Enemy)q;
                if (e.getStat("Name").equals(name)){
                    return e;
                }
            }
            catch(ClassCastException e){ 
                System.out.println(e);
            }
        }
        System.out.println("No enemy was found with name : " + name);
        return null;
    }
    

}
