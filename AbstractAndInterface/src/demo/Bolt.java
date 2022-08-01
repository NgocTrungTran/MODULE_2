package demo;

public class Bolt extends Animal implements Barkable,Runable{
    protected Bolt(String kindOfAnimal) {
        super ( kindOfAnimal );
    }

    @Override
    public void eat() {
        System.out.println ("Gobble");
    }

    @Override
    public void bark() {
        System.out.println ("Gow gow!");
    }

    @Override
    public void run() {
        System.out.println ("Runing!");
    }

}
