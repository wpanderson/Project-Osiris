// Stores demonstrations and tests to be run

package PrototypeDemos;

import D5DataStructures.*;
import java.util.*;
import java.io.*;

public class Demonstrations {
    public static void main(String[] args) throws IOException {
        // Call whatever demos we want to run at a given time here
        CSVImportDemo();
    }
    
    // Demonstrates CSV import and basic database functionality.
    public static void CSVImportDemo() throws IOException {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the path to the CSV file of enemies you wish to import.");
        System.out.println("Sample file named \"Test_Database_Monsters.csv\"");
        System.out.print("Filepath: ");
        String filePath = console.next();
        System.out.println();
        DataStorage database = new DataStorage();
        try {
            database.addEnemiesFromCSV(filePath);
            System.out.println("Successful. Names of monsters in database:");
            System.out.println();
            for(Enemy enemy : database.getEnemyList()) {  
                System.out.println(" - " + enemy);
            }
            System.out.println();
        } catch(FileNotFoundException e) {
            System.out.println("File not found. Details:");
            System.out.println(e.getMessage());
        }
    }
    
    // Add new demos as static methods below, then call in main to use 
    // (and comment out or remove other demos present in main if desired).
}
