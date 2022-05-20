package BTInterface_Comparable;

import java.util.Arrays;

public class ComparableRectangleTest {
    public static void main(String[] args) {
        ComparableRectangle[] rectangles = new ComparableRectangle[3];
        rectangles[0] = new ComparableRectangle(2.4, 3.7);
        rectangles[1] = new ComparableRectangle ();
        rectangles[2] = new ComparableRectangle (3.4, 3.5, "red", true);

        System.out.println ("Pre-sorted: ");
        for (ComparableRectangle rectangle : rectangles) {
            System.out.println (rectangle);
        }

        Arrays.sort (rectangles);

        System.out.println ("After-sort: ");
        for (ComparableRectangle rectangle : rectangles) {
            System.out.println (rectangle);
        }
    }
}
