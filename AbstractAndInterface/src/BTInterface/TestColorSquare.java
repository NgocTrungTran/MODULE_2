package BTInterface;

public class TestColorSquare {
    public static void main(String[] args) {
        Square square = new Square ();
        System.out.println ("Before: ");
        System.out.println (square.getColor ());

        System.out.println ("After: ");
        System.out.println (square.howtoColor ("yellow"));
    }
}
