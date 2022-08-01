package demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
    public static void main(String[] args) {

        try (ObjectOutputStream oos = new ObjectOutputStream ( new FileOutputStream ( "src/demo/product.txt" ) )){
            Product product = new Product ( 1, "Iphone 12", 280000, "New" );
            oos.writeObject ( product );
            oos.flush ();
        }
        catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
