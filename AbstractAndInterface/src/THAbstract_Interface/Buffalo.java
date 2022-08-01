package THAbstract_Interface;

public class Buffalo extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Buffalo: ummmmmmm!";
    }

    @Override
    public int foot() {
        return 4;
    }

    public String howToEat() {
        return "Meat in the kitchen";
    }
}
