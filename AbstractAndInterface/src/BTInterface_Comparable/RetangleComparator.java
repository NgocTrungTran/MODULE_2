package BTInterface_Comparable;

import java.util.Comparator;

public class RetangleComparator implements Comparator<Rectangle> {

    @Override
    public int compare(Rectangle rec1, Rectangle rec2) {
        if ( rec1.getWidth () > rec2.getWidth () ) {
            return 1;
        } else if ( rec1.getWidth () < rec2.getWidth () ) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
