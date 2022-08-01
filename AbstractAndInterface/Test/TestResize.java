import BTInterface.Circle;
import BTInterface.Rectangle;
import BTInterface.Square;
import com.sun.prism.RenderTarget;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestResize {
    @Test
    public void testCircle() {
        Circle circle = new Circle (6);
        double before = circle.getRadius ();
        circle.resize ( 50 );
        Assertions.assertEquals ( before * ((double) 50 / 100), circle.getRadius ());
    }

    @Test
    public void testRectangle() {
        Rectangle rectangle = new Rectangle (4, 12) {
            @Override
            public String howtoColor(String color) {
                return null;
            }
        };
        rectangle.resize ( 50 );
        Assertions.assertEquals ( 2, rectangle.getWidth (), "Width" );
        Assertions.assertEquals ( 6, rectangle.getLength (), "Length" );
        Assertions.assertEquals ( 12, rectangle.getArea (), "Area" );
    }

    @Test
    public void testSquare() {
        Square square = new Square(8);
        square.resize(50);
        Assertions.assertEquals(16, square.getArea());
    }
}
