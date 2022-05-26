package BTFizzBuzzTranslate;

import java.util.Scanner;

public class FizzBuzzTranslate {
    public static String traslate(int number) {
        Scanner sc = new Scanner ( System.in );
//        System.out.println ("Enter number: ");
//        number = sc.nextInt ();

        if ( number > 0 && number < 100 ) {
            if ( number % 3 == 0 && number % 5 == 0 ) {
                return "FizzBuzz";
            } else if ( number % 5 == 0 ) {
                return "Buzz";
            } else if ( number % 3 == 0 ) {
                return "Fizz";
            } else {
                return readNumber ( number );
            }
        } else {
            return "Number invalid!";
        }
    }

    public static String readNumber(int number) {
        String fNum = readFNumber ( number );
        String sNum = readSNumber ( number );
        if ( number < 10 ) {
            return sNum;
        } else {
            return fNum + " " + sNum;
        }
    }

    public static String readFNumber(int number){
        int firstNumber = number / 10;
        String fNum = null;
        switch (firstNumber) {
            case 1:
                return fNum = "Muoi";
            case 2:
                return fNum = "Hai";
            case 3:
                return fNum = "Ba";
            case 4:
                return fNum = "Bon";
            case 5:
                return fNum = "Nam";
            case 6:
                return fNum = "Sau";
            case 7:
                return fNum = "Bay";
            case 8:
                return fNum = "Tam";
            case 9:
                return fNum = "Chin";
        }
        return fNum;
    }

    public static String readSNumber(int number){
        int secondNumber = number % 10;
        String sNum = null;
        switch (secondNumber) {
            case 1:
                return sNum = "Mot";
            case 2:
                return sNum = "Hai";
            case 3:
                return sNum = "Ba";
            case 4:
                return sNum = "Bon";
            case 5:
                return sNum = "Nam";
            case 6:
                return sNum = "Sau";
            case 7:
                return sNum = "Bay";
            case 8:
                return sNum = "Tam";
            case 9:
                return sNum = "Chin";
        }
        return sNum;
    }
}
