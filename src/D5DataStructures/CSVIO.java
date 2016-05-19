// Handles all file IO with CSV files.  For importing (and perhaps later exporting)
// to (and from) a readable format that may be compatible with other programs.
package D5DataStructures;

import D5DataStructures.DraftClasses.Item;
import java.io.*;
import java.util.*;

public class CSVIO {

    /**
     * Takes in a String representing the file path of a CSV file that contains
     * enemies to be imported. Returns an ArrayList of enemies found in the
     * file. Known limitations: Requires every line to have the expected number
     * of fields (commas) or more. May crash if there are too few.
     *
     * @param importFilePath
     * @return ArrayList of enemies
     */
    public static ArrayList<Enemy> importEnemiesFromCSV(String importFilePath) {
        BufferedReader br = null;
        String line; // To hold each line read in
        ArrayList<Enemy> enemyList = new ArrayList(); // Hold array of enemies

        try {
            br = new BufferedReader(new FileReader(importFilePath));
            br.readLine(); // Skip the first title line in file
            while ((line = br.readLine()) != null) {

                // Creates a string array with the stats/info for the enemy
                // delimited by "," or tags are "tag1, tag2, tag3"
                String[] enemy = line.split("\"?(,|$)(?=(([^\"]*\"){2})*[^\"]*$)\"?");
                String source = enemy[0];
                String name = enemy[1];
                String size = enemy[2];
                String type = enemy[3];

                // Mutliple tags are added as a single string
                // For example: human, shapechanger is stored as a single
                // string "human, shapechanger"
                String tagString = enemy[4];
                ArrayList<String> tags = new ArrayList();

                // For multiple tags, each tag is converted into a string
                // then added to the tags ArrayList
                if (tagString.contains(",")) {
                    Scanner tagScanner = new Scanner(tagString).useDelimiter(",");
                    while (tagScanner.hasNext()) // add each tag and remove extra space
                    {
                        tags.add(tagScanner.next().replace(" ", ""));
                    }
                } // Otherwise add single tag
                else {
                    tags.add(tagString);
                }

                Entity.Align1 align1;
                Entity.Align2 align2;

                String alignString = enemy[5]; // Holds alignment string

                if (alignString.contains("L")) {
                    align1 = Entity.Align1.LAWFUL;
                } else if (alignString.contains("C")) {
                    align1 = Entity.Align1.CHAOTIC;
                } else {
                    align1 = Entity.Align1.NEUTRAL;
                }

                if (alignString.contains("G")) {
                    align2 = Entity.Align2.GOOD;
                } else if (alignString.contains("E")) {
                    align2 = Entity.Align2.EVIL;
                } else if (alignString.contains("S")) {
                    align2 = Entity.Align2.SCIENTIFIC;
                } else {
                    align2 = Entity.Align2.NEUTRAL;
                }

                // Sets challenge rating if present
                double challenge = 0.0;
                if (!enemy[6].equals("")) {
                    challenge = Double.parseDouble(enemy[6]);
                }

                // Sets expValue if present
                int expValue = 0;
                if (!enemy[7].equals("")) {
                    expValue = Integer.parseInt(enemy[7]);
                }

                // Holds stats if present, otherwise set to 0
                int[] stats = new int[6];
                Arrays.fill(stats, 0);
                for (int i = 8; i < (8 + 6); i++) {
                    if (!enemy[i].equals("")) {
                        stats[i - 8] = Integer.parseInt(enemy[i]);
                    }
                }

                // Holds skill modifiers if present, otherwise set to 0
                int[] skillModifiers = new int[18];
                Arrays.fill(skillModifiers, 0);
                for (int i = 14; i < (14 + 18); i++) {
                    if (!enemy[i].equals("")) {
                        skillModifiers[i - 14] = Integer.parseInt(enemy[i]);
                    }
                }

                Enemy currentEnemy = new Enemy(source, name, size, type, tags, align1,
                        align2, challenge, expValue, stats, skillModifiers);
                enemyList.add(currentEnemy);
            } // end while loop
        } // end try 
        catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } // end finally

        return enemyList;
    }

   /**
    * Work in progress, will change upon further knowledge of how items will be
    * used. 
    * @param filePath
    * @return nothing yet
    */
    public static ArrayList<Item> importItemsFromCSV(String filePath) {
        BufferedReader br = null;
        String line; // To hold each line read in
        ArrayList<Enemy> itemList = new ArrayList(); // Hold arrayList of items

        try {
            br = new BufferedReader(new FileReader(filePath));
            br.readLine(); // Skip the first title line in file
            while ((line = br.readLine()) != null) {

                // To split each string by "," or multiple commas in quotes
                String[] item = line.split("\"?(,|$)(?=(([^\"]*\"){2})*[^\"]*$)\"?");
                String source, name, type, rarity, attunement = "", notes = "";

                // Set specified variables
                source = item[0];
                name = item[1];
                type = item[2];
                rarity = item[3];

                // Sets attunement if present
                if (item.length > 4) {
                    attunement = item[4];
                }

                // Sets notes if present
                if (item.length > 5) {
                    notes = item[5];
                }

            } // end while loop                
        }// end try block
        catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } // end finally

        return null; // Will change once a better item() constructor is specified
    }

    /**
     * Simple import for any csv file. Will read each line and append it to an
     * arrayList. May be useful for quick and dirty printing.
     *
     * @param filePath string that holds file path to import
     * @return arrayList that contains each input line
     */
    public static ArrayList<String> simpleImport(String filePath) {
        ArrayList<String> outputList = new ArrayList();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                outputList.add(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        return outputList;
    }
}
