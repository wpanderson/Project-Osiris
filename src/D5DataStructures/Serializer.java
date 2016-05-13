/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D5DataStructures;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializer {
    public static void saveToFile(String filename) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(this);
            objectOut.close();
            fileOut.close();
            System.out.println("Saved to: " + filename);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    public static void loadFromFile(String filename) {
        DataStorage d;
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            d = (DataStorage) in.readObject();
            this = d;
        } catch(IOException e) {
            System.out.println(e);
        } catch(ClassNotFoundException c) {
            System.out.println(c);
        }
    }
}
