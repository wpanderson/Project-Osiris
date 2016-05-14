// Stores demonstrations and tests to be run

package PrototypeDemos;

import D5DataStructures.*;
import java.util.*;
import java.io.*;

public class Demonstrations {
    public static void main(String[] args) throws IOException {
        // Call whatever demos we want to run at a given time here
        
        DatabaseInteractionDemo();

        //CSVImportEnemiesDemo();
        //CSVItemImportDemo();
        //CSVPlayerImportDemo();
    }
    
    public static void DatabaseInteractionDemo(){
        
        // Alright, the database now has minimal read and write functionality

        // Calling the DataStorage constructor without the monster csv tells it
        // that we want to load the default monsters. There is another method
        // signature that lets you load a custom monster file as well
        DataStorage d = new DataStorage("Test_Items.csv", "Test_Players.csv");
        
        // To get a player, you must call into the database with the players name.
        // I got rid of the ID's as there is really no use to them. Names should
        // do just fine.
        Player p1 = d.getPlayerByName("Player1");
        
        // Getting player stats is again, just with Strings. These strings
        // match ONE TO ONE with the strings taken from the CSV file. So
        // if you want to add a stat to Players called "Stat91293". After loading
        // the file from the CSV you will then be able to call 
        // String stat = player.getStat("Stat91293");
        System.out.println("Player1 Language : " + p1.getStat("Language"));
        
        // Again this works for all players and all stats
        Player p2 = d.getPlayerByName("Player2");
        System.out.println("\nAll of Player2's Stats : \n" + p2);
        
        // Inventories are slightly more complicated
        System.out.println("Player1's inventory : ");
        {
            // You must first initialize a blank item list
            ArrayList<Item> inv_items = new ArrayList<Item>();
            
            // Then you must call into the database with 
            // database.getItemsMatchingIDs(ArrayList<UUID> ids);
            // You can either get the ID's from somewhere else, or you can call
            // into the player class with
            // player.getInventoryUUIDs(); which returns an ArrayList<UUID>
            inv_items = d.getItemsMatchingIDs(p1.getInventoryUUIDs());
            
            // Now you have an array of Items belonging to player
            for(Item i: inv_items){
                System.out.println(i);
            }
        }
        
        
        // Again, a second example
        System.out.println("Player2's inventory : ");
        {
            ArrayList<Item> inv_items = new ArrayList<Item>();
            inv_items = d.getItemsMatchingIDs(p2.getInventoryUUIDs());
            for(Item i: inv_items){
                System.out.println(i);
            }
        }
        
        // Example on how to increment stats. Select the name of the stat. And
        // if it can parse into an int. It is incremented. Only works on integer values!!!!!
        // P.S, decrement by passing in negative values
        //p1.incrementStat("XP", 100);
        System.out.println(p1.getStat("XP"));
        System.out.println("\nAll of Player1's Stats : \n" + p1);
        
        
        // This is copy pasta crazy. Gonna clean up the class heirachy here soon
        // But after I get things working correctly
        // Anyway though. CSVIO.exportXXXXX(file name, ArrayList<data>)
        // will take all the data given to it. Parse it into csv format
        // and then write it to the file specified.
        //CSVIO.exportPlayers("players.csv", d.getPlayerList());
        //CSVIO.exportEnemies("enemies.csv", d.getEnemyList());
        //CSVIO.exportItems("items.csv", d.getItemList());
        
        Encounter e1 = 
                Generator.Generate_Encounter(
                        d.getEnemyList(), 
                        d.getPlayerList(), 
                        Encounter.DIFFICULTY.DEADLY, 
                        Encounter.LOCATION.DEFAULT, 
                        Generator.Encounter_Type.SWARM);

        Encounter e2 = 
            Generator.Generate_Encounter(
                    d.getEnemyList(), 
                    d.getPlayerList(), 
                    Encounter.DIFFICULTY.HARD, 
                    Encounter.LOCATION.DEFAULT, 
                    Generator.Encounter_Type.SINGLEBOSS);

        Encounter e3 = 
            Generator.Generate_Encounter(
                    d.getEnemyList(), 
                    d.getPlayerList(), 
                    Encounter.DIFFICULTY.HARD, 
                    Encounter.LOCATION.DEFAULT, 
                    Generator.Encounter_Type.BOSS);

        Encounter e4 = 
            Generator.Generate_Encounter(
                    d.getEnemyList(), 
                    d.getPlayerList(), 
                    Encounter.DIFFICULTY.DEADLY, 
                    Encounter.LOCATION.DEFAULT, 
                    Generator.Encounter_Type.MIXED);
 
    }
    

    public static void CSVPlayerImportDemo(){
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the path to the CSV file of players you wish to import.");
        System.out.println("Sample file named \"Test_Players.csv\"");
        System.out.print("Filepath: ");
        String filePath = console.next();

        DataStorage database = new DataStorage();
 
        database.addPlayersFromCSV(filePath);
        System.out.println("Successful. Names of players in database : \n");
        for(Player p : database.getPlayerList()) {  
            System.out.println(p);
        }

    }
    
    public static void CSVItemImportDemo(){
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the path to the CSV file of items you wish to import.");
        System.out.println("Sample file named \"Test_Items.csv\"");
        System.out.print("Filepath: ");
        String filePath = console.next();

        DataStorage database = new DataStorage();
  
        database.addItemsFromCSV(filePath);
        System.out.println("Successful. Names of Items in database : \n");
        
        for(Item p : database.getItemList()) {  
            System.out.println(p);
        }

    }
    
    
    // Demonstrates CSV import and basic database functionality.
    public static void CSVImportEnemiesDemo() throws IOException {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the path to the CSV file of enemies you wish to import.");
        System.out.println("Sample file named \"Test_Database_Monsters.csv\"");
        System.out.print("Filepath: ");
        String filePath = console.next();

        DataStorage database = new DataStorage();

        database.addEnemiesFromCSV(filePath);
        System.out.println("Successful. Names of monsters in database : \n");

        for(Enemy enemy : database.getEnemyList()) {  
            System.out.println(enemy);
        }

    }
    
    // Add new demos as static methods below, then call in main to use 
    // (and comment out or remove other demos present in main if desired).
}
