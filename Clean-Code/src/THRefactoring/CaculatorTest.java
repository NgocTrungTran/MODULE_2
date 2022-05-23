package THRefactoring;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CaculatorTest {
    @Test
    @DisplayName ( "Testing addition" )
    void testCalculateAdd() {
        int firstOperand = 1;
        int secondOperand = 1;
        char operator = '+';
        int expected = 2;

        int result = Calculator.caculate ( firstOperand, secondOperand,operator );
        Assertions.assertEquals ( expected, result );
    }

    @Test
    @DisplayName ( "Testing addition" )
    void testCalculateSub() {
        int firstOperand = 2;
        int secondOperand = 1;
        char operator = '-';
        int expected = 1;

        int result = Calculator.caculate ( firstOperand, secondOperand,operator );
        Assertions.assertEquals ( expected, result );
    }

    @Test
    @DisplayName ( "Testing addition" )
    void testCalculateMul() {
        int firstOperand = 2;
        int secondOperand = 2;
        char operator = '*';
        int expected = 4;

        int result = Calculator.caculate ( firstOperand, secondOperand,operator );
        Assertions.assertEquals ( expected, result );
    }

    @Test
    @DisplayName ( "Testing addition" )
    void testCalculateDiv() {
        int firstOperand = 6;
        int secondOperand = 3;
        char operator = '/';
        int expected = 2;

        int result = Calculator.caculate ( firstOperand, secondOperand,operator );
        Assertions.assertEquals ( expected, result );
    }

    @Test
    @DisplayName ( "Testing addition" )
    void testCalculateDivByZero() {
        int firstOperand = 2;
        int secondOperand = 0;
        char operator = '/';

        assertThrows ( RuntimeException.class,
                ()-> {Calculator.caculate ( firstOperand, secondOperand,operator );
        });
    }

    @Test
    @DisplayName ( "Testing addition" )
    void testCalculateWrongOperator() {
        int firstOperand = 2;
        int secondOperand = 0;
        char operator = '=';

        assertThrows ( RuntimeException.class,
                ()-> {Calculator.caculate ( firstOperand, secondOperand,operator );
                });
    }
}
