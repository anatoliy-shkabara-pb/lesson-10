package s09extendsuper;

public class Animal {

    protected final String name;

    public Animal(String name) {
        this.name = name;
    }

    public void feed() {
        System.out.println(name + " - кушает");
    }
}
