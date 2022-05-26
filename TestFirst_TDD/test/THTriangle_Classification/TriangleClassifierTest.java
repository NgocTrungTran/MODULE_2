package THTriangle_Classification;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    @DisplayName ( "a = b = c => Tam giac deu" )
    void testSideLengthTGdeu() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "Tam giác đều";

        String result = TriangleClassifier.sideLength ( a, b, c );
        assertEquals (expected, result );
    }

    @Test
    @DisplayName ( "a = b || a = c => Tam giac can" )
    void testSideLengthTGcan() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "Tam giác cân";

        String result = TriangleClassifier.sideLength ( a, b, c );
        assertEquals (expected, result );
    }

    @Test
    @DisplayName ( "a != b != c => Tam giac thuong" )
    void testSideLengthTGthuong() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "Tam giác thường";

        String result = TriangleClassifier.sideLength ( a, b, c );
        assertEquals (expected, result );
    }

    @Test
    @DisplayName ( "Tong 2 canh <= canh con lai: Khong phai tam giac" )
    void testSideLengthNotTG() {
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "Không phải là tam giác";

        String result = TriangleClassifier.sideLength ( a, b, c );
        assertEquals (expected, result );
    }

    @Test
    @DisplayName ( "Canh < 0: Khong phai tam giac" )
    void testSideLengthNotTG1() {
        int a = -1;
        int b = 2;
        int c = 1;
        String expected = "Không phải là tam giác";

        String result = TriangleClassifier.sideLength ( a, b, c );
        assertEquals (expected, result );
    }

    @Test
    @DisplayName ( "Canh = 0: Khong phai tam giac" )
    void testSideLengthNotTG2() {
        int a = 0;
        int b = 1;
        int c = 1;
        String expected = "Không phải là tam giác";

        String result = TriangleClassifier.sideLength ( a, b, c );
        assertEquals (expected, result );
    }
}