package BTNextDayCalculator;

public class NextDayCalculator {


    public static String nextDay(int day, int month, int year) {
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if ( isDivisibleBy4 ) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if ( isDivisibleBy100 ) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if ( isDivisibleBy400 ) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        switch (month) {
            case 2:
                if ( isLeapYear ) {
                    if ( day >= 1 && day < 29 ) {
                        day = day + 1;
                    } else if ( day == 29 ) {
                        day = 1;
                        month = month + 1;
                    } else {
                        System.out.println ( "Invalid input time!" );
                    }
                } else {
                    if ( day >= 1 && day < 28 ) {
                        day = day + 1;
                    } else if ( day == 28 ) {
                        day = 1;
                        month = month + 1;
                    } else {
                        System.out.println ( "Invalid input time!" );
                    }
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if ( day >= 1 && day < 31 ) {
                    day = day + 1;
                } else if ( day == 31 ) {
                    day = 1;
                    if ( month == 12 ) {
                        month = 1;
                        year = year + 1;
                    } else {
                        month = month + 1;
                    }
                } else {
                    System.out.println ( "Invalid input time!" );
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if ( day >= 1 && day < 30 ) {
                    day = day + 1;
                } else if ( day == 30 ) {
                    day = 1;
                    month = month + 1;
                } else {
                    System.out.println ( "Invalid input time!" );
                }
                break;
        }
        return String.format("%s-%s-%s",day,month,year);
    }
}



