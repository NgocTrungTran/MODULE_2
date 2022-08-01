package demo;

public class Nemo extends Animal implements Swimable{
    protected Nemo(String kindOfAnimal) {
        super ( kindOfAnimal );
    }

    @Override
    public void eat() {
        System.out.println ("Eat plankton");
    }

    @Override
    public void swim() {
        System.out.println ("Swimming!");
    }
}
