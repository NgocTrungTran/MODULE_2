package TypesOfTriangles;

public class TypesOfTriangles {
    private static double firstEdge;
    private static double secondEdge;
    private static double thirdEdge;

    public static boolean conditionsTriangle;
    private static final boolean pitagoFirstEdge = firstEdge * firstEdge == secondEdge * secondEdge + thirdEdge * thirdEdge;
    private static final boolean pitagoSecondEdge = secondEdge * secondEdge == firstEdge * firstEdge + thirdEdge * thirdEdge;
    private static final boolean pitagoThirdEdge = thirdEdge * thirdEdge == firstEdge * firstEdge + secondEdge * secondEdge;

//    public TypesOfTriangles(double firstEdge, double secondEdge, double thirdEdge) {
//        TypesOfTriangles.firstEdge = firstEdge;
//        TypesOfTriangles.secondEdge = secondEdge;
//        TypesOfTriangles.thirdEdge = thirdEdge;
//    }

    public static boolean conditionsTriangle() {
        return conditionsTriangle = firstEdge > 0 && secondEdge > 0 && thirdEdge > 0 &&
                firstEdge + secondEdge > thirdEdge &&
                secondEdge + thirdEdge > firstEdge &&
                firstEdge + thirdEdge > secondEdge;
    }

    public static String checkTypeTriangle(double firstEdge, double secondEdge, double thirdEdge) {
        TypesOfTriangles.firstEdge = firstEdge;
        TypesOfTriangles.secondEdge = secondEdge;
        TypesOfTriangles.thirdEdge = thirdEdge;
        if ( !conditionsTriangle () ) return "Not a Triangle";
        if ( equilateralTriangle () ) return "Equilateral Triangle";
        if ( isoscelesTriangle () ) return "Isosceles Triangle";
        if ( rightTriangle () ) return "Right Triangle";
        return "Normal Triangle";
    }

    public static boolean equilateralTriangle() {
        return firstEdge == secondEdge && secondEdge == thirdEdge;
    }

    public static boolean isoscelesTriangle() {
        return firstEdge == secondEdge || secondEdge == thirdEdge || firstEdge == thirdEdge;
    }

    public static boolean rightTriangle() {
        return pitagoFirstEdge || pitagoSecondEdge || pitagoThirdEdge;
    }

}


