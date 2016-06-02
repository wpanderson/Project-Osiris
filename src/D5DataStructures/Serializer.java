package D5DataStructures;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import main_ui.*;

public class Serializer {
    public static void saveToFile(String filename) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(main_ui.MainGUI.DATABASE);
            objectOut.close();
            fileOut.close();
            System.out.println("Saved to: " + filename);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    public static void loadFromFile(String filename) {
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            main_ui.MainGUI.DATABASE = (DataStorage) objectIn.readObject();
        } catch(IOException e) {
            System.out.println(e);
        } catch(ClassNotFoundException c) {
            System.out.println(c);
        }
    }
}
