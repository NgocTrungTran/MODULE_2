package demo.byte_Stream;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream ( "D:\\CODE GYM\\MODULE_2\\IO_File_Text\\src\\demo\\byte_Stream\\input.txt" );
        FileOutputStream fileOutputStream = new FileOutputStream ( "D:\\CODE GYM\\MODULE_2\\IO_File_Text\\src\\demo\\byte_Stream\\output.txt" );
        int i = -1;
        byte[] bytes = new byte[3];/* Đọc n byte 1 thời điểm*/
        while ((i = fileInputStream.read (bytes)) != -1) {
            System.out.println ( new String (bytes, 0,i) );
            fileOutputStream.write ( bytes, 0,i );
        }
        fileInputStream.close ();
        fileOutputStream.close ();
    }
}
