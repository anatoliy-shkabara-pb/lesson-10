package s09extendsuper;

public class Doge extends Pet {

    public Doge(String name) {
        super(name);
    }

    public void bark() {
        System.out.println("Собачонок " + name + " гавкает");
    }
}
