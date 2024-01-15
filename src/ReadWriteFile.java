import java.io.*;
import java.util.ArrayList;

public class ReadWriteFile {
    public static void writeDataToFile(ArrayList<Product> m) {
        try {
            FileOutputStream fos = new FileOutputStream("data.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(m);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<Product> readDataFromFile(){
        ArrayList<Product> m = new ArrayList<>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.dat"));)
        {
            m = (ArrayList<Product>) ois.readObject();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return m;
    }
}
