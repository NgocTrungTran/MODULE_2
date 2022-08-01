package THAbstract_Interface;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: o o O...!";
    }

    @Override
    public int foot() {
        return 2;
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}
