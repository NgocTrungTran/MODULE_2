package demo;

public class AngryBird extends Animal implements Flyable {
    protected AngryBird(String kindOfAnimal) {
        super ( kindOfAnimal );
    }

    @Override
    public void eat() {
        System.out.println ("Eat insects");
    }

    @Override
    public void fly() {
        System.out.println ("Flying!");
    }
}
