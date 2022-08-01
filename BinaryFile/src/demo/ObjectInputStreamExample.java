package demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample {
    public static void main(String[] args) throws Exception {
        try (ObjectInputStream ois = new ObjectInputStream ( new FileInputStream ( "src/demo/product.txt" ) )){
            Product product = (Product) ois.readObject ();
            System.out.println (product);
        }
        catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
