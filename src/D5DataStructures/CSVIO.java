// Handles all file IO with CSV files.  For importing (and perhaps later exporting)
// to (and from) a readable format that may be compatible with other programs.
package D5DataStructures;

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
    

}
