package TypesOfTriangles;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TypesOfTrianglesTest {
    private final double FIRST_EDGE;
    private final double SECOND_EDGE;
    private final double THIRD_EDGE;

    private final String EXPECTED;

    public TypesOfTrianglesTest(double firstEdge, double secondEdge, double thirdEdge, String expected) {
        this.FIRST_EDGE = firstEdge;
        this.SECOND_EDGE = secondEdge;
        this.THIRD_EDGE = thirdEdge;
        this.EXPECTED = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getAllType() {
        return Arrays.asList ( new Object[][]{
                {5, 10, 20, "Not a Triangle"},
                {-5, 2, 0, "Not a Triangle"},
                {3, 3, 4, "Isosceles Triangle"},
                {5, 5, 5, "Equilateral Triangle"},
                {3, 4, 5, "Right Triangle"},
                {5, 7, 9, "Normal Triangle"}

        } );
    }

    @Test
    public void checkAllType() {
        String result = "";
        if ( FIRST_EDGE <= 0 || SECOND_EDGE <= 0 || THIRD_EDGE <= 0 ) {
            result = "Not a Triangle";
        } else {
            result = TypesOfTriangles.checkTypeTriangle ( FIRST_EDGE, SECOND_EDGE, THIRD_EDGE );
        }
        Assertions.assertEquals ( EXPECTED, result );
    }
}