package THFindMax;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get ( 0 );
        for (Integer number : numbers) {
            if ( max < number ) {
                max = number;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile ();
        List<Integer> number = readAndWriteFile.readFile ( "Num.txt" );
        int maxValue = findMax ( number );
        readAndWriteFile.writeFile ( "result.txt", maxValue );
    }
}
