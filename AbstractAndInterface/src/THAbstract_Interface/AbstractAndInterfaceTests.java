package THAbstract_Interface;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];

        animals[0] = new Buffalo ();
        animals[1] = new Chicken ();

        for (Animal animal : animals) {
            System.out.println (animal.makeSound ());
            System.out.println ("Have " + animal.foot () + " foot");

            if (animal instanceof Edible) {
                System.out.println (((Edible) animal).howToEat ());
            }

        }

//        Fruit[] fruits = new Fruit[2];
//        fruits[0] = new Orange ();
//        fruits[1] = new Apple ();
//        for (Fruit fruit : fruits) {
//            System.out.println (fruit.howToEat ());
//        }
    }
}
