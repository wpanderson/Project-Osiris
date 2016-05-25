// Stores demonstrations and tests to be run

package PrototypeDemos;

import D5DataStructures.DraftClasses.Encounter;
import D5DataStructures.*;
import D5DataStructures.Item;
import java.util.*;
import java.io.*;

public class Demonstrations {
    public static void main(String[] args) throws IOException {
        // Call whatever demos we want to run at a given time here
        //CSVImportDemo();
        //GeneratorDemo();
        ItemGeneratorDemo();
        //MagicItemDemo();
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
    
    public static void GeneratorDemo() throws IOException{
        Scanner console = new Scanner(System.in);
        //String filePath = console.next();
        System.out.println();
        DataStorage database = new DataStorage();
        try {                           // No ti
            database.addEnemiesFromCSV("src//D.R.A.G.O.N.S_CSV//Monsters_DB.csv");
            database.addPlayer(new Player());
            database.addPlayer(new Player());
            database.addPlayer(new Player());
            database.addPlayer(new Player());
            
            long seed = System.nanoTime();
            Random rng = new Random(seed);
            
            int level = rng.nextInt(20);
            for (Player p : database.getPlayerList()){
                p.setLevel(level);
            }
            
            Encounter e = Generator.Generate_Encounter(
                            database.getEnemyList(),
                            database.getPlayerList(),
                            Encounter.DIFFICULTY.DEADLY,
                            Encounter.LOCATION.NULL,       // No locations currently
                            Encounter.Encounter_Type.BOSS);
            
            System.out.println(e.toString());
            
        } catch(FileNotFoundException e) {
            System.out.println("File not found. Details:");
            System.out.println(e.getMessage());
        }
    }
    
    public static void ItemGeneratorDemo() throws IOException{
        
        ArrayList<Item> item_pool = CSVIO.importMagicItemsFromCSV("src//D.R.A.G.O.N.S_CSV//Magic_items.csv");
    
        ArrayList<Item.Type> item_type = new ArrayList<Item.Type>();
        item_type.add(Item.Type.GENERIC);
        item_type.add(Item.Type.WEAPON);
        item_type.add(Item.Type.SCROLL);
        item_type.add(Item.Type.POTION);
        item_type.add(Item.Type.ROD);
        item_type.add(Item.Type.WONDROUS);
        


        ArrayList<Item> generated_items =
        Generator.Generate_Magic_Items(Item.Rarity.RARE, 20, item_type, item_pool);
        
        for (Item i: generated_items){
            System.out.println(i.toString());
        }

    }
        
    public static void MagicItemDemo(){
        ArrayList<Item> test = CSVIO.importMagicItemsFromCSV("src//D.R.A.G.O.N.S_CSV//Magic_items.csv");
        
        for (Item itemToAdd : test){
        System.out.println(itemToAdd.toString());
        }  
    }
        
    }

    
    // Add new demos as static methods below, then call in main to use 
    // (and comment out or remove other demos present in main if desired).


