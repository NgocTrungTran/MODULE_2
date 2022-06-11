import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
//            Tạo file ghi dữ liệu
            FileWriter writer = new FileWriter ( "test.csv" );
//              Ghi một đối tượng string
            writer.write ( "Codegym" );
            writer.write ( "Hue" );
            writer.write ( "28" );
            writer.write ( "Nguyen Tri Phuong" );
//            Đóng file khi xong việc
            writer.close ();
        } catch (IOException e) {
            e.printStackTrace ();
        }


//        try {
//            File inFile = new File ( "test.csv" );
////            nối FileReader với một file csv
//            FileReader fileReader = new FileReader ( inFile );
////              nối BufferReader với FileReader
//            BufferedReader reader = new BufferedReader ( fileReader );
//
//            String line;
////              đọc từng dòng cho đến khi không có gì để đọc nữa
//            while ((line = reader.readLine ()) != null) {
//                System.out.println (line);
//            }
////            Đóng file khi xong việc
//            reader.close ();
//        }  catch (IOException e) {
//            e.printStackTrace ();
//        }

//        String str = "Code,Raising,the,bar";
////        tách các mẫu dữ liệu cách nhau bởi "."
//        String[] result = str.split ( "," );
////        Duyệt mảng để in ra các mẫu dữ liệu
//        for (String item : result) {
//            System.out.println (item);
//        }
    }
}

