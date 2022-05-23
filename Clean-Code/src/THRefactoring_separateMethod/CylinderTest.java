package THRefactoring_separateMethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class CylinderTest {
    @Test
    @DisplayName ( "Testing getVolume(0, 0)" )
    void testGetVolume0And0() {
        int radius = 0;
        int height = 0;
        double expected = 0;

        double result = Cylinder.getVolume ( radius, height );
        Assertions.assertEquals ( expected, result );
    }

    @Test
    @DisplayName ( "Testing getVolume(1, 2)" )
    void testGetVolume1And2() {
        int radius = 1;
        int height = 2;
        double expected = 18.84955592153876;

        double result = Cylinder.getVolume ( radius, height );
        Assertions.assertEquals ( expected, result );
    }
}
