package demo.char_Stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader ( "D:\\CODE GYM\\MODULE_2\\IO_File_Text\\src\\demo\\char_Stream\\input.txt" );
            out = new FileWriter ( "D:\\CODE GYM\\MODULE_2\\IO_File_Text\\src\\demo\\char_Stream\\output.txt" );
            int character;
            while ((character = in.read ()) != -1) {
                out.write ( character );
            }
            System.out.println ("Otôkê");
        } catch (IOException e) {
            e.printStackTrace ();
        }finally {
            try {
                if ( in != null ) {
                    in.close ();
                }
                if ( out != null ) {
                    out.close ();
                }
            }catch ( IOException e) {
                e.printStackTrace ();
            }
        }
    }
}
