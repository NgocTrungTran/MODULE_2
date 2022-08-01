package demo;

public abstract class Animal {
    private String kindOfAnimal;

    protected Animal(String kindOfAnimal) {
        this.kindOfAnimal = kindOfAnimal;
    }

    public String getKindOfAnimal() {
        return kindOfAnimal;
    }

    public void setKindOfAnimal(String kindOfAnimal) {
        this.kindOfAnimal = kindOfAnimal;
    }

    public abstract void eat();
}
