package s09extendsuper;

public class Kitty extends Pet {

    public Kitty(String name) {
        super(name);
    }

    public void mew() {
        System.out.println("Котик " + name + " мяукает");
    }
}
