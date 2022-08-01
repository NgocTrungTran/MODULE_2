package demo;

public class Runtime {
    public static void main(String[] args) {
        Circle circle = new Circle ( 2.4 );
        if ( circle.getRadius () > 0 ) {
            System.out.printf ( "Perimeter Circle = %.2f, Area Circle = %.2f\n",
                    circle.getPerimeter (),
                    circle.getArea () );
        } else {
            System.out.print ( "" );
        }

        Cylinder cylinder = new Cylinder ();
        cylinder.setRadius ( 3.1 );
        cylinder.setHeight ( 2.4 );
        if ( cylinder.getRadius () > 0 && cylinder.getHeight () > 0 ) {
            System.out.printf ( "Area Cylinder = %.2f, Volume Cylinder = %.2f\n",
                    cylinder.getAreaCylinder (),
                    cylinder.getVolumeCylinder () );
        } else {
            System.out.print ( "" );
        }

        Cone cone = new Cone ();
        cone.setRadius ( 2.3 );
        cone.setHeight ( 1.2 );
        cone.setRuling ( 4.2 );
        if ( cone.getRadius () > 0 && cone.getHeight () > 0 && cone.getRuling () > 0 ) {
            System.out.printf ( "Area Cone = %.2f, Volume Cone = %.2f\n",
                    cone.getAreaCone (),
                    cone.getVolumeCone () );
        } else {
            System.out.print ( "" );
        }

    }
}
