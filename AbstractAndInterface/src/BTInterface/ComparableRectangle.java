package BTInterface;

public class ComparableRectangle extends Rectangle
implements Comparable<ComparableRectangle>{

    public ComparableRectangle() {

    }
    public ComparableRectangle(double width, double length) {
        super(width, length );
    }

    public ComparableRectangle(double width, double length, String color, boolean filled) {
        super(width, length, color, filled );
    }


    @Override
    public int compareTo(ComparableRectangle o) {
        if (getLength () > o.getLength ()) {
            return 1;
        }
        else if (getLength () < o.getLength () ) {
            return -1;
        }
        else {
            return 1;
        }

    }
}
