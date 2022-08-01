package demo_find_minus;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<> ();
        try {
            File file = new File ( filePath );

            if ( !file.exists () ) {
                throw new FileNotFoundException ();
            }

            BufferedReader br = new BufferedReader ( new FileReader ( file ) );
            String line = "";
            while ((line = br.readLine ()) != null) {
                numbers.add ( Integer.parseInt ( line ) );
            }
            br.close ();
        } catch (Exception e) {
            System.out.println ( "" );
        }
        return numbers;
    }
    //    Tạo phương thức writeFile trong lớp ReadAndWriteFile để ghi giá trị âm đầu tiên cần tìm vào trong File
    public void writeFile(String filePath, int negative) {
        try {
            FileWriter writer = new FileWriter ( filePath, true );
            BufferedWriter bufferedWriter = new BufferedWriter ( writer );
            bufferedWriter.write ("Giá trị âm đầu tiên là: " + negative );
            bufferedWriter.close ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
