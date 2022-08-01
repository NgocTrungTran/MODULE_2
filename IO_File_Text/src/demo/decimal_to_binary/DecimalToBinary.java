package demo.decimal_to_binary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DecimalToBinary {
    public static void main(String[] args) throws IOException {
//        try (FileOutputStream fout = new FileOutputStream("src\\demo\\decimal_to_binary\\decimal.txt")) {
//            String s = "134";
//            byte[] b = s.getBytes ();
//            fout.write ( b );
//            System.out.println ("Otôkê");
//        } catch (Exception e) {
//            System.out.println (e);
//        }
        try (FileInputStream fin = new FileInputStream ( "src\\demo\\decimal_to_binary\\decimal.txt" )){
            int i = 0;
            while ((i = fin.read ()) != -1) {
                System.out.println ((char) i);
            }
        }
        catch (Exception e){
            System.out.println (e);
        }
    }
}
