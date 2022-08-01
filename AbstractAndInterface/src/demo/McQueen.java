package demo;

public class McQueen extends Machine implements Runable {
    public McQueen(String kindOfMachine) {
        super ( kindOfMachine );
    }

    @Override
    public void run() {
        System.out.println ("Runing!");
    }

    @Override
    public void fuel() {
        System.out.println ("Gasoline or oil");
    }
}
