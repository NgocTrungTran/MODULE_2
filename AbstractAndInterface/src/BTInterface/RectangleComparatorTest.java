package BTInterface;

import java.util.Arrays;
import java.util.Comparator;

public class RectangleComparatorTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle ( 3.5, 3.8 ) {
            @Override
            public String howtoColor(String color) {
                return null;
            }
        };
        rectangles[1] = new Rectangle () {
            @Override
            public String howtoColor(String color) {
                return null;
            }
        };
        rectangles[2] = new Rectangle ( 1.8, 4.2, "Blue", true ) {
            @Override
            public String howtoColor(String color) {
                return null;
            }
        };

        System.out.println ("Pre-sorted: ");
        for (Rectangle rectangle : rectangles) {
            System.out.println (rectangle);
        }

        Comparator rectangleComparator = new RetangleComparator ();
        Arrays.sort ( rectangles, rectangleComparator );

        System.out.println ("After-sorted: ");
        for (Rectangle rectangle : rectangles) {
            System.out.println (rectangle);
        }
    }
}
