// Handles all file IO with CSV files.  For importing (and perhaps later exporting)
// to (and from) a readable format that may be compatible with other programs.
package D5DataStructures;

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
     * Takes in string filepath for a magic item csv to create Item class
     * objects.
     *
     * @param filePath
     * @return itemList arraylist with Item objects
     */
    public static ArrayList<Item> importMagicItemsFromCSV(String filePath) {
        BufferedReader br = null;
        String line; // To hold each line read in

        ArrayList<Item> itemList = new ArrayList(); // Hold arrayList of items

        try {
            br = new BufferedReader(new FileReader((filePath)));
            br.readLine();
            while ((line = br.readLine()) != null) {
                String attune = ""; // set to "" if not present
                String notes = "";  // set to "" if not present
                Item.Rarity rarity; // to hold rarity enum
                boolean attunement = false; // attunement false by default
                Item.Type type;     // to hold type enum
                String[] item = line.split("\"?(,|$)(?=(([^\"]*\"){2})*[^\"]*$)\"?");

                String source = item[0]; // holds source
                String name = item[1];   // holds name

                String itemType = item[2]; // holds item type string
                // check for type and set to POTION, RING, ROD, SCROLL, STAFF,
                // WAND or WONDROUS
                if (itemType.equals("Potion")) {
                    type = Item.Type.POTION;
                } else if (itemType.equals("Ring")) {
                    type = Item.Type.RING;
                } else if (itemType.equals("Rod")) {
                    type = Item.Type.ROD;
                } else if (itemType.equals("Scroll")) {
                    type = Item.Type.SCROLL;
                } else if (itemType.equals("Staff")) {
                    type = Item.Type.STAFF;
                } else if (itemType.equals("Wand")) {
                    type = Item.Type.WAND;
                } else if (itemType.equals("Weapon")) {
                    type = Item.Type.WEAPON;
                } else if (itemType.equals("Armor")) {
                    type = Item.Type.ARMOR;
                } else {
                    type = Item.Type.WONDROUS;
                }

                String rar = item[3]; // hold rarity string
                
                // check for rarity and set to 
                // UNCOMMON, COMMON, RARE, VERY_RARE, or LEGENDARY
                if (rar.equals("Uncommon")) {
                    rarity = Item.Rarity.UNCOMMON;
                } else if (rar.equals("Common")) {
                    rarity = Item.Rarity.COMMON;
                } else if (rar.equals("Rare")) {
                    rarity = Item.Rarity.RARE;
                } else if (rar.equals("Very Rare")) {
                    rarity = Item.Rarity.VERY_RARE;
                } else {
                    rarity = Item.Rarity.LEGENDARY;
                }

                // set attunement = true if yes, otherwise false
                if (item.length > 4) {

                    attune = item[4];
                    if (attune.equals("yes")) {
                        attunement = true;
                    }
                }

                // set notes if present
                if (item.length > 5) {
                    notes = item[5];
                }

                Item itemToAdd = new Item(source, name, type, rarity,
                        attunement, notes);

                itemList.add(itemToAdd);

            } // end while loop                
        }// end try block
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return itemList; // item arraylist
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

    /**
     * Work in Progress Testing with player objects
     *
     * @param filePath
     * @return
     */
    public ArrayList<Player> importPlayersFromCSV(String filePath) {
        ArrayList<Player> players = new ArrayList();
        Scanner scan = null;
        try {
            scan = new Scanner(new BufferedReader(new FileReader(filePath))).useDelimiter(",");
            //Type,Person,Name,UUID,Level,Race,Alignment,XP,Stength,Dexterity,
            //Constitution,Intelligence,Wisdom,Charism,Platinum,Gold,Silver,Copper,Arrows,Bolts,HP,Armor
            /*
             Player,Charles,Matriarchal pasta,9001,2,Dwarf,NN,5,10,5,2,0,0,10,999,5,5,5,0,0,500,12            
             String source, String name, int playerHP,
             ArrayList<String> tags, Entity.Align1 align1, Entity.Align2 align2,
             int[] stats,
             Entity.Class playerClass, Entity.Race playerRace, int level,
             int exp, int profBonus, boolean[] skillProfs, String playerName*/
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
                scan.nextLine(); // eat up the first line
                String type = scan.next();
                String person = scan.next();
                String name = scan.next();
                int uuid = scan.nextInt();
                int level = scan.nextInt();
                String race = scan.next();
                String alignment = scan.next();
                int xp = scan.nextInt();
                int stength = scan.nextInt();
                int dexterity = scan.nextInt();
                int constitution = scan.nextInt();
                int intelligence = scan.nextInt();
                int wisdon = scan.nextInt();
                int charisma = scan.nextInt();
                int platinum = scan.nextInt();
                int gold = scan.nextInt();
                int silver = scan.nextInt();
                int copper = scan.nextInt();
                int arrows = scan.nextInt();
                int bolts = scan.nextInt();
                int hp = scan.nextInt();
                int armor = scan.nextInt();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

}
