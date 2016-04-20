
<<<<<<< HEAD:src/Test_Of_Possible_Data_Structures/DataInterface.java
package Test_Of_Possible_Data_Structures;
=======
package D5DataStructures;
>>>>>>> 6c7d85cdf489b29470c9ff5e8fc4dcc576fda104:src/D5DataStructures/DataInterface.java

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;


public class DataInterface {
    
    private HashMap<UUID, Entity> world_entities;
    private HashMap<UUID, Item>   world_items;
    
    
    public void StoreEntities(String path){
        try{
            File f = new File(path);
            if(f.exists() && !f.isDirectory()) { 
                System.out.println("File exists, overwriting");
            }
               
            BufferedWriter output = new BufferedWriter(new FileWriter(f));
        
            for (Entity ent: world_entities.values()){
<<<<<<< HEAD:src/Test_Of_Possible_Data_Structures/DataInterface.java
                output.write(ent.FormatForStorage());
=======
                output.write(ent.formatForStorage());
>>>>>>> 6c7d85cdf489b29470c9ff5e8fc4dcc576fda104:src/D5DataStructures/DataInterface.java
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
    public void LoadEntities(String path){
        
    }
    
    public void StoreItems(String path){
        try{
            File f = new File(path);
            if(f.exists() && !f.isDirectory()) { 
                System.out.println("File exists, overwriting");
            }
               
            BufferedWriter output = new BufferedWriter(new FileWriter(f));
        
            for (Item ite: world_items.values()){
<<<<<<< HEAD:src/Test_Of_Possible_Data_Structures/DataInterface.java
                output.write(ite.FormatForStorage());
=======
                output.write(ite.formatForStorage());
>>>>>>> 6c7d85cdf489b29470c9ff5e8fc4dcc576fda104:src/D5DataStructures/DataInterface.java
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
    public void LoadItems(String path){
        
    }
    
    public void StoreObjects(String path){
        
    }
    
    public void LoadObjects(String path){
        
    }
    
    public void StoreEncounters(String path){
        
    }
    
    public void LoadEncounters(String path){
        
    }
    
    
    // From here on will go all the methods for interacting with the data such as
    // modifying, deleting, adding items objects and entities. This will be tightly
    // coupled with the UI so probably postpone doing these until the UI has been
    // more spec'd out
}
