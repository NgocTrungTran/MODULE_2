package demo;

public class Main {
    public static void main(String[] args) {
//        Animal[] animal = new Animal[3];
//        animal[0] = new Bolt ( "terrestrial animals" );
//        animal[1] = new AngryBird ( "aerial animals" );
//        animal[2] = new Nemo ( "underwater animals" );
//
//        Bolt dog = new Bolt ( "terrestrial animals" );
//        System.out.println ( "Dog is " + dog.getKindOfAnimal () );
//        dog.eat ();
//        dog.bark ();
//        dog.run ();
//        System.out.println ( "" );
//
//        McQueen car = new McQueen ( "Car" );
//        System.out.print ( car.getKindOfMachine () + " use " );
//        car.fuel ();
//        car.run ();
//        System.out.println ( "" );
//
//        Siddeley plane = new Siddeley ( "Plane" );
//        System.out.print ( plane.getKindOfMachine () + " use " );
//        plane.fuel ();
//        plane.fly ();
//        System.out.println ( "" );
//
//        AngryBird bird = new AngryBird ( "aerial animals" );
//        System.out.println ( "AngryBird is " + bird.getKindOfAnimal () );
//        bird.eat ();
//        bird.fly ();
//        System.out.println ( "" );
//
//        Nemo fish = new Nemo ( "underwater animals" );
//        System.out.println ( "Nemo is " + fish.getKindOfAnimal () );
//        fish.eat ();
//        fish.swim ();


        Object[] objects = new Object[5];
        objects[0] = new Bolt ( "terrestrial animals" );
        objects[1] = new AngryBird ( "aerial animals" );
        objects[2] = new Nemo ( "underwater animals" );
        objects[3] = new McQueen ( "Car" );
        objects[4] = new Siddeley ( "Plane" );
        for (Object obj : objects) {
            if ( obj instanceof Barkable )
                ((Barkable) obj).bark ();
            if ( obj instanceof Runable )
                ((Runable) obj).run ();
            if ( obj instanceof Flyable )
                ((Flyable) obj).fly ();
            if ( obj instanceof Swimable )
                ((Swimable) obj).swim ();
        }
    }
}

