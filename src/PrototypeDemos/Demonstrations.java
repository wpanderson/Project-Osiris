// Stores demonstrations and tests to be run

package PrototypeDemos;

import D5DataStructures.*;
import java.util.*;
import java.io.*;

public class Demonstrations {
    public static void main(String[] args) throws IOException {
        // Call whatever demos we want to run at a given time here
        CSVImportEnemiesDemo();
        CSVItemImportDemo();
        CSVPlayerImportDemo();
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
