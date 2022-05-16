import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner ( System.in );
        do {
            System.out.println ( "Enter the number to read (0 to 999): " );
            number = sc.nextInt ();
            while (number >= 0 && number < 1000) {
                int first = number / 100;
                int second = (number % 100) / 10;
                int third = number % 10;

                String result = null;

                if ( number < 10 ) {
                    result = zeroToNine ( third );
                    System.out.printf ( "%d reads as %s", number, result );
                } else if ( number < 20 ) {
                    result = read10To19 ( third );
                    System.out.printf ( "%d reads as %s", number, result );
                } else if ( number < 100 ) {
                    result = read20To99 ( second );
                    String unit = "";
                    if ( third != 0 ) {
                        unit = zeroToNine ( third );
                        System.out.printf ( "%d reads as: %s %s", number, result, unit );
                    } else {
                        System.out.printf ( "%d reads as: %s %s", number, result, unit );
                    }
                } else {
                    result = zeroToNine ( first );
                    if ( second == 0 ) {
                        if ( third == 0 ) {
                            System.out.printf ( "%d reads as: %s hundred", number, result );
                            return;
                        } else {
                            String unit = zeroToNine ( third );
                            System.out.printf ( "%d reads as: %s hundred and %s", number, result, unit );
                        }
                    } else if ( second == 1 ) {
                        String readTens = read10To19 ( third );
                        System.out.printf ( "%d reads as: %s hundred and %s", number, result, readTens );
                    } else {
                        String tens = read20To99 ( second );
                        if ( third != 0 ) {
                            String unit = zeroToNine ( third );
                            System.out.printf ( "%d reads as: %s hundred and %s %s", number, result, tens, unit );
                        } else {
                            System.out.printf ( "%d reads as: %s hundred and %s", number, result, tens );
                        }
                    }
                }
                System.out.println ( "\nEnter the number to read (0 to 999): " );
                number = sc.nextInt ();
            }
        } while (number < 0 || number >= 1000);
    }

    public static String zeroToNine(int number) {
        String unit = null;
        switch (number) {
            case 0:
                unit = "Zero";
                break;
            case 1:
                unit = "One";
                break;
            case 2:
                unit = "Two";
                break;
            case 3:
                unit = "Three";
                break;
            case 4:
                unit = "Four";
                break;
            case 5:
                unit = "Five";
                break;
            case 6:
                unit = "Six";
                break;
            case 7:
                unit = "Seven";
                break;
            case 8:
                unit = "Eight";
                break;
            case 9:
                unit = "Nine";
                break;
        }
        return unit;
    }

    public static String read10To19(int number) {
        String read = null;
        switch (number) {
            case 0:
                read = "Ten";
                break;
            case 1:
                read = "Eleven";
                break;
            case 2:
                read = "Twelve";
                break;
            case 3:
                read = "Thirteen";
                break;
            case 4:
                read = "Fourteen";
                break;
            case 5:
                read = "Fifteen";
                break;
            case 6:
                read = "Sisteen";
                break;
            case 7:
                read = "Seventeen";
                break;
            case 8:
                read = "Eighteen";
                break;
            case 9:
                read = "Nineteen";
                break;
        }
        return read;
    }

    public static String read20To99(int number) {
        String readTens = null;
        switch (number) {
            case 2:
                readTens = "Twenty";
                break;
            case 3:
                readTens = "Thirty";
                break;
            case 4:
                readTens = "Fourty";
                break;
            case 5:
                readTens = "Fifty";
                break;
            case 6:
                readTens = "Sixty";
                break;
            case 7:
                readTens = "Seventy";
                break;
            case 8:
                readTens = "Eighty";
                break;
            case 9:
                readTens = "Ninety";
                break;
        }
        return readTens;
    }
}

