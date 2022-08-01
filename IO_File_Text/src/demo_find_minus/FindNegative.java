package demo_find_minus;

import THFindMax.ReadAndWriteFile;

import java.util.List;

public class FindNegative {
    public static int findNegative(List<Integer> numbers) {
        int negative;
        for (Integer number : numbers) {
            if ( number < 0 ) {
                negative = number;
                return negative;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile ();
        List<Integer> number = readAndWriteFile.readFile ( "src/demo_find_minus/Num.txt" );
        int negativeValue = findNegative ( number );
        readAndWriteFile.writeFile ( "src/demo_find_minus/result.txt", negativeValue );
    }
}
