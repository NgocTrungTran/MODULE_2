package BTInterface;

public class TestResize {
    public static void main(String[] args) {
        int x = (int) Math.floor ( Math.random () * 10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle (x, "Blue", false);
        shapes[1] = new Rectangle ( x, x, "White", true ) {
            @Override
            public String howtoColor(String color) {
                return null;
            }
        };
        shapes[2] = new Square (x, "Violet", false);
        System.out.println ("Before resize: ");
        for (Shape a : shapes) {
            System.out.println (a);
        }

        System.out.println ("After resize: ");
        for (Shape a : shapes){
            a.resize ( Math.random () * 100);
            System.out.println (a);
        }
    }
}
