// Handles all file IO with CSV files.  For importing (and perhaps later exporting)
// to (and from) a readable format that may be compatible with other programs.
package D5DataStructures;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CSVIO {
    
    private static String csv_regex = "\"([^\"]*)\"|(?<=,|^)([^,]*)(?:,|$)";
    
    public static ArrayList<Player> importPlayers(String filePath)
            throws FileNotFoundException {
        
        // Open up the file
        FileReader importFile = new FileReader(filePath);
        Scanner s = new Scanner(importFile);
        
        ArrayList<Player> players = new ArrayList<Player>();
        ArrayList<String> stat_tags = new ArrayList<String>();
       
        // Import the stat tags
        String dict_line = s.nextLine();
        Scanner delimits = new Scanner(dict_line).useDelimiter(",");
        while (delimits.hasNext()){
            stat_tags.add(delimits.next());
        }
        
        // Populate the hashmap
        while (s.hasNextLine()){
            
            // luv u stackoverflow
            String line = s.nextLine();
            Matcher m = Pattern.compile(csv_regex).matcher(line);
            
            HashMap<String, String> stat = new HashMap<String, String>();
            
            int i = 0;
            while (m.find()) {
                String q;
                if (m.group(1) != null) {
                    q = m.group(1);
                } 
                else {
                    q = m.group(2);
                }
                if (q.equals("")){
                    q = "nullVal"; // If no val was given, set to null
                }
                stat.put(stat_tags.get(i), q); // Add to the hashmap
                
                i++;
            }
            
            players.add(new Player(stat));
        }
        
        return players;
    }
    public static ArrayList<Enemy> importEnemies(String filePath)
            throws FileNotFoundException {
        
        // Open up the file
        FileReader importFile = new FileReader(filePath);
        Scanner s = new Scanner(importFile);
        
        ArrayList<Enemy> enemies = new ArrayList<Enemy>();
        ArrayList<String> stat_tags = new ArrayList<String>();
       
        // Import the stat tags
        String dict_line = s.nextLine();
        Scanner delimits = new Scanner(dict_line).useDelimiter(",");
        while (delimits.hasNext()){
            stat_tags.add(delimits.next());
        }
        
        // Populate the hashmap
        while (s.hasNextLine()){

            // luv u stackoverflow
            String line = s.nextLine();
            Matcher m = Pattern.compile(csv_regex).matcher(line);
            
            HashMap<String, String> stat = new HashMap<String, String>();
            
            int i = 0;
            while (m.find()) {
                String q;
                if (m.group(1) != null) {
                    q = m.group(1);
                } 
                else {
                    q = m.group(2);
                }
                if (q.equals("")){
                    q = "nullVal"; // If no val was given, set to null
                }
                stat.put(stat_tags.get(i), q); // Add to the hashmap
                
                i++;
            }
    
            enemies.add(new Enemy(stat));
        }
        
        return enemies;
    }
    public static ArrayList<Item> importItems(String filePath)
            throws FileNotFoundException {

        ArrayList<Item> items = new ArrayList<Item>();
        FileReader importFile = new FileReader(filePath);
        Scanner s = new Scanner(importFile);

        ArrayList<String> stat_tags = new ArrayList<String>();

        // Import the stat tags
        String dict_line = s.nextLine();
        Scanner delimits = new Scanner(dict_line).useDelimiter(",");
        while (delimits.hasNext()){
            stat_tags.add(delimits.next());
        }

        while (s.hasNextLine()){
            // luv u stackoverflow
            String line = s.nextLine();
            Matcher m = Pattern.compile(csv_regex).matcher(line);
            
            HashMap<String, String> stat = new HashMap<String, String>();
            
            int i = 0;
            while (m.find()) {
                String q;
                if (m.group(1) != null) {
                    q = m.group(1);
                } 
                else {
                    q = m.group(2);
                }
                if (q.equals("")){
                    q = "nullVal"; // If no val was given, set to null
                }
                stat.put(stat_tags.get(i), q); // Add to the hashmap
                
                i++;
            }
            
            items.add(new Item(stat));
        }

        return items;
    }
    
    public static void exportPlayers(String filePath, ArrayList<Player> players) {
        
        // The main output array
        ArrayList<String[]> fileRows = new ArrayList<String[]>();
        
        // To add things without the full set of items you must find the union
        // of all of them
        HashMap<String, String> header_hash_map = new HashMap<String, String>();
        
        // This is pretty slow
        for(Player p: players){
            HashMap<String, String> player_stat_map = p.exportStats(); 
 
            for (Map.Entry<String, String> e: player_stat_map.entrySet()){ // For each stat that the player contains
                header_hash_map.put(e.getKey(), "null");                   // Add it to the list. May overwrite duplicate value 
            }                                                              // but that's the point
        }
        
        // Now transpose that into an array so it can be written to the head of the csv
        String csv_header[] = new String[header_hash_map.size()];
        int i = 0;
        for (Map.Entry<String, String> e: header_hash_map.entrySet()){
                csv_header[i] = e.getKey();
                i++;
        }
       
        // Sort it to make it purty
        Arrays.sort(csv_header);
        
        // Add the header, and now we're good to go to start writing player values
        fileRows.add(csv_header);

        // For each stat is the header, lookup the stat for the player and add it
        // to it's row. And then add that row to the main output array
        for(Player p: players){
            HashMap<String, String> player_stats = p.exportStats(); 
            
            String[] data = new String[csv_header.length];
            
            int q = 0;
            for (String stat_header: csv_header){
                String val = player_stats.get(stat_header);
                if (val == null){                  // If the player didn't have the stat
                    val = "null";                  // put null in its place
                }
                data[q] = val;
                q++;
            }
            
            // Now that we have gotten all of the players stats, 
            // add it to the main output file
            fileRows.add(data);
        }
        
        // Now we have all of the data for all of the players. Start writing the file
        
        try{
            CSVWriter writer = new CSVWriter(new FileWriter(filePath), ',');
            for (String[] s: fileRows){
                writer.writeNext(s);
            }
            
            // And now close the file
            writer.close();
        }
        catch(IOException e){
            System.out.println("CSVIO export failed.");
            System.out.println(e);
        }
        
    }
    public static void exportEnemies(String filePath, ArrayList<Enemy> enemies){
        
        // The main output array
        ArrayList<String[]> fileRows = new ArrayList<String[]>();
        
        // To add things without the full set of items you must find the union
        // of all of them
        HashMap<String, String> header_hash_map = new HashMap<String, String>();
        
        // This is pretty slow
        for(Enemy p: enemies){
            HashMap<String, String> player_stat_map = p.exportStats(); 
 
            for (Map.Entry<String, String> e: player_stat_map.entrySet()){ // For each stat that the player contains
                header_hash_map.put(e.getKey(), "null");                   // Add it to the list. May overwrite duplicate value 
            }                                                              // but that's the point
        }
        
        // Now transpose that into an array so it can be written to the head of the csv
        String csv_header[] = new String[header_hash_map.size()];
        int i = 0;
        for (Map.Entry<String, String> e: header_hash_map.entrySet()){
                csv_header[i] = e.getKey();
                i++;
        }
       
        // Sort it to make it purty
        Arrays.sort(csv_header);
        
        // Add the header, and now we're good to go to start writing player values
        fileRows.add(csv_header);

        // For each stat is the header, lookup the stat for the player and add it
        // to it's row. And then add that row to the main output array
        for(Enemy p: enemies){
            HashMap<String, String> player_stats = p.exportStats(); 
            
            String[] data = new String[csv_header.length];
            
            int q = 0;
            for (String stat_header: csv_header){
                String val = player_stats.get(stat_header);
                if (val == null){                  // If the player didn't have the stat
                    val = "null";                  // put null in its place
                }
                data[q] = val;
                q++;
            }
            
            // Now that we have gotten all of the players stats, 
            // add it to the main output file
            fileRows.add(data);
        }
        
        // Now we have all of the data for all of the players. Start writing the file
        
        try{
            CSVWriter writer = new CSVWriter(new FileWriter(filePath), ',');
            for (String[] s: fileRows){
                writer.writeNext(s);
            }
            
            // And now close the file
            writer.close();
        }
        catch(IOException e){
            System.out.println("CSVIO export failed.");
            System.out.println(e);
        }
    }
    public static void exportItems(String filePath, ArrayList<Item> items){
        // The main output array
        ArrayList<String[]> fileRows = new ArrayList<String[]>();
        
        // To add things without the full set of items you must find the union
        // of all of them
        HashMap<String, String> header_hash_map = new HashMap<String, String>();
        
        // This is pretty slow
        for(Item p: items){
            HashMap<String, String> player_stat_map = p.exportStats(); 
 
            for (Map.Entry<String, String> e: player_stat_map.entrySet()){ // For each stat that the player contains
                header_hash_map.put(e.getKey(), "null");                   // Add it to the list. May overwrite duplicate value 
            }                                                              // but that's the point
        }
        
        // Now transpose that into an array so it can be written to the head of the csv
        String csv_header[] = new String[header_hash_map.size()];
        int i = 0;
        for (Map.Entry<String, String> e: header_hash_map.entrySet()){
                csv_header[i] = e.getKey();
                i++;
        }
       
        // Sort it to make it purty
        Arrays.sort(csv_header);
        
        // Add the header, and now we're good to go to start writing player values
        fileRows.add(csv_header);

        // For each stat is the header, lookup the stat for the player and add it
        // to it's row. And then add that row to the main output array
        for(Item p: items){
            HashMap<String, String> player_stats = p.exportStats(); 
            
            String[] data = new String[csv_header.length];
            
            int q = 0;
            for (String stat_header: csv_header){
                String val = player_stats.get(stat_header);
                if (val == null){                  // If the player didn't have the stat
                    val = "null";                  // put null in its place
                }
                data[q] = val;
                q++;
            }
            
            // Now that we have gotten all of the players stats, 
            // add it to the main output file
            fileRows.add(data);
        }
        
        // Now we have all of the data for all of the players. Start writing the file
        
        try{
            CSVWriter writer = new CSVWriter(new FileWriter(filePath), ',');
            for (String[] s: fileRows){
                writer.writeNext(s);
            }
            
            // And now close the file
            writer.close();
        }
        catch(IOException e){
            System.out.println("CSVIO export failed.");
            System.out.println(e);
        }
    }
    

}
