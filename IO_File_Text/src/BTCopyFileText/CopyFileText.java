package BTCopyFileText;

import java.io.*;
import java.nio.file.Files;


public class CopyFileText {
    public static void main(String[] args) throws IOException {
        InputStream inStream = null;
        OutputStream outStream = null;

        try {
            inStream = Files.newInputStream ( new File ( "Num.txt" ).toPath () );
            outStream = Files.newOutputStream ( new File ( "copyFile.txt" ).toPath () );

            int length;
            byte[] buffer = new byte[1024];

            // copy the file content in bytes
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("File is copied successful!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inStream.close();
            outStream.close();
        }
    }
}
