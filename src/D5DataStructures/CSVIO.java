// Handles all file IO with CSV files.  For importing (and perhaps later exporting)
// to (and from) a readable format that may be compatible with other programs.
package D5DataStructures;

import java.io.*;
import java.util.*;


public class CSVIO {
    
    // Takes in a String representing the file path of a CSV file
    // that contains enemies to be imported.
    // Returns an ArrayList of enemies found in the file.
    // Known limitations:
    // Requires every line to have the expected number of fields (commas) or more.
    // Will crash if there are too few.
    public static ArrayList<Enemy> importEnemiesFromCSV(String importFilePath) 
            throws FileNotFoundException {
        ArrayList<Enemy> enemiesToAdd = new ArrayList<Enemy>();
        FileReader importFile = new FileReader(importFilePath);
        Scanner s = new Scanner(importFile);
        
        // Skips the legend line, since we aren't using it for anything right now
        s.nextLine();
        
        while(s.hasNextLine()) {
            // I can think of about a thousand ways to do this part, and this is
            // one of the worst. Will be revisited.
            String currentLine = s.nextLine();
            Scanner ls = new Scanner(currentLine).useDelimiter(",");
            
            String source = ls.next();
            String name = ls.next();
            String size = ls.next();
            String type = ls.next();
            
            // Tags will have to be delimited in a different way, broken
            // up into seperate tags and put into an array.
            ArrayList<String> tags = new ArrayList<String>();
            String allTags = ls.next();
            
            String alignString = ls.next();
            
            // Sets alignment based on characters in aligment String.
            // Humor's Charles' "CS" alignment.
            Entity.Align1 align1;
            Entity.Align2 align2;
            if(alignString.charAt(0) == 'L') {
                align1 = Entity.Align1.LAWFUL;
            } else if(alignString.charAt(0) == 'C'){
                align1 = Entity.Align1.CHAOTIC;
            } else {
                align1 = Entity.Align1.NEUTRAL;
            }
            
            if(alignString.charAt(1) == 'G') {
                align2 = Entity.Align2.GOOD;
            } else if(alignString.charAt(1) == 'E') {
                align2 = Entity.Align2.EVIL;
            } else if(alignString.charAt(1) == 'S') {
                align2 = Entity.Align2.SCIENTIFIC;
            } else {
                align2 = Entity.Align2.NEUTRAL;
            }
            
            // Sets challenge double if found
            double challenge = 0.0;
            if(ls.hasNextDouble()) {
                challenge = ls.nextDouble();
            } else {
                ls.next();
            }
            
            // Sets exp value int if found
            int expValue = 0;
            if(ls.hasNextInt()) {
                expValue = ls.nextInt();
            } else {
                ls.next();
            }
            
            // Fills stats array with all stats found, leaves rest 0
            int[] stats = new int[6];
            Arrays.fill(stats, 0);
            for(int i = 0; i < 6; i++) {
                if(ls.hasNextInt()){
                    stats[i] = ls.nextInt();
                } else {
                    ls.next();
                }
            }
            
            int[] skillModifiers = new int[18];
            Arrays.fill(skillModifiers, 0);
            for(int i = 0; i < 18; i++) {
                if(ls.hasNextInt()){
                    skillModifiers[i] = ls.nextInt();
                } else {
                    ls.next();
                }
            }
            Enemy currentEnemy = new Enemy(source, name, size, type, tags, align1, 
                    align2, challenge, expValue, stats, skillModifiers);
            enemiesToAdd.add(currentEnemy);
        }
        
        return enemiesToAdd;
    }
}
