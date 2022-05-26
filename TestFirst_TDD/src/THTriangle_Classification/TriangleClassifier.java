package THTriangle_Classification;

public class TriangleClassifier {
    public static String sideLength(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0) {
            if (a + b <= c || a + c <= b || b + c <= a) {
                return "Không phải là tam giác";
            }
            else if ( a == b && a == c ) {
                return "Tam giác đều";
            }
            else if ( a == b || a == c || b == c ) {
                return "Tam giác cân";
            }
            else {
                return "Tam giác thường";
            }
        }
        else {
            return "Không phải là tam giác";
        }
    }
}
