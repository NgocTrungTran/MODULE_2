package BTFizzBuzzTranslate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    @DisplayName ( "3 return Fizz" )
    void traslate3() {
        int number = 3;
        String expected = "Fizz";

        String result = FizzBuzzTranslate.traslate(number);
        assertEquals ( expected, result );
    }

    @Test
    @DisplayName ( "9 return Fizz" )
    void traslate9() {
        int number = 9;
        String expected = "Fizz";

        String result = FizzBuzzTranslate.traslate(number);
        assertEquals ( expected, result );
    }

    @Test
    @DisplayName ( "5 return Buzz" )
    void traslate5() {
        int number = 5;
        String expected = "Buzz";

        String result = FizzBuzzTranslate.traslate(number);
        assertEquals ( expected, result );
    }

    @Test
    @DisplayName ( "20 return Buzz" )
    void traslate20() {
        int number = 20;
        String expected = "Buzz";

        String result = FizzBuzzTranslate.traslate(number);
        assertEquals ( expected, result );
    }

    @Test
    @DisplayName ( "15 return FizzBuzz" )
    void traslate15() {
        int number = 15;
        String expected = "FizzBuzz";

        String result = FizzBuzzTranslate.traslate(number);
        assertEquals ( expected, result );
    }

    @Test
    @DisplayName ( "1 return Mot" )
    void traslate2() {
        int number = 1;
        String expected = "Mot";

        String result = FizzBuzzTranslate.traslate(number);
        assertEquals ( expected, result );
    }

    @Test
    @DisplayName ( "14 return Muoi Bon" )
    void traslate14() {
        int number = 14;
        String expected = "Muoi Bon";

        String result = FizzBuzzTranslate.traslate(number);
        assertEquals ( expected, result );
    }

    @Test
    @DisplayName ( "37 return Ba Bay" )
    void traslate37() {
        int number = 37;
        String expected = "Ba Bay";

        String result = FizzBuzzTranslate.traslate(number);
        assertEquals ( expected, result );
    }

    @Test
    @DisplayName ( "-5 return Number invalid!" )
    void traslateMinus5() {
        int number = -5;
        String expected = "Number invalid!";

        String result = FizzBuzzTranslate.traslate(number);
        assertEquals ( expected, result );
    }

    @Test
    @DisplayName ( "100 return Number invalid!" )
    void traslate100() {
        int number = 100;
        String expected = "Number invalid!";

        String result = FizzBuzzTranslate.traslate(number);
        assertEquals ( expected, result );
    }
}