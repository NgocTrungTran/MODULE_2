package demo;

public abstract class Machine {
    private String kindOfMachine;

    public Machine(String kindOfMachine) {
        this.kindOfMachine = kindOfMachine;
    }

    public String getKindOfMachine() {
        return kindOfMachine;
    }

    public void setKindOfMachine(String kindOfMachine) {
        this.kindOfMachine = kindOfMachine;
    }

    public abstract void fuel();
}
