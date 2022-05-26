package BTNextDayCalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    @DisplayName ( "Test 01/01/2018 => next day = 02/01/2018" )
    void testNextDay01012018() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "2-1-2018";

        String result = NextDayCalculator.nextDay(day, month, year);
        assertEquals ( expected, result );
    }

    @Test
    @DisplayName ( "Test 31/01/2018 => next day = 01/02/2018" )
    void testNextDay31012018() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = "1-2-2018";

        String result = NextDayCalculator.nextDay(day, month, year);
        assertEquals ( expected, result );
    }

    @Test
    @DisplayName ( "Test 30/04/2018 => next day = 01/05/2018" )
    void testNextDay30042018() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String expected = "1-5-2018";

        String result = NextDayCalculator.nextDay(day, month, year);
        assertEquals ( expected, result );
    }

    @Test
    @DisplayName ( "Test 28/02/2018 => next day = 01/03/2018" )
    void testNextDay28022018() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected = "1-3-2018";

        String result = NextDayCalculator.nextDay(day, month, year);
        assertEquals ( expected, result );
    }

    @Test
    @DisplayName ( "Test 29/02/2020 => next day = 01/03/2020" )
    void testNextDay29022020() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected = "1-3-2020";

        String result = NextDayCalculator.nextDay(day, month, year);
        assertEquals ( expected, result );
    }

    @Test
    @DisplayName ( "Test 31/12/2018 => next day = 01/01/2019" )
    void testNextDay31122018() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String expected = "1-1-2019";

        String result = NextDayCalculator.nextDay(day, month, year);
        assertEquals ( expected, result );
    }
}