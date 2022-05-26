package THabsolute_number_calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @Test
    @DisplayName ( "Test absolute number 0 = 0" )
    void testFindAbsolute0() {
        int number = 0;
        int expected = 0;

        int result = AbsoluteNumberCalculator.findAbsolute ( number );
        assertEquals ( expected, result );
    }

    @Test
    @DisplayName ( "Test absolute number 1 = 1" )
    void testFindAbsolute1() {
        int number = 1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute ( number );
        assertEquals ( expected, result );
    }

    @Test
    @DisplayName ( "Test absolute number -1 = 1" )
    void testFindAbsoluteMinus1() {
        int number = -1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute ( number );
        assertEquals ( expected, result );
    }
}