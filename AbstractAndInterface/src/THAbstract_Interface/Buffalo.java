package THAbstract_Interface;

public class Tiger extends Animal {
    @Override
    public String makeSound() {
        return "Tiger: roarrrrr!";
    }

    @Override
    public int foot() {
        return 4;
    }
}
