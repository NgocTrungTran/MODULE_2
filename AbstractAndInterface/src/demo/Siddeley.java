package demo;

public class Siddeley extends McQueen implements Flyable {
    public Siddeley(String kindOfMachine) {
        super ( kindOfMachine );
    }
    @Override
    public void fuel() {
        System.out.println ("Gasoline or oil");
    }

    @Override
    public void fly() {
        System.out.println ("Flying!");
    }
}
