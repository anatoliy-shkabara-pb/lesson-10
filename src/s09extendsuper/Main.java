package s09extendsuper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Pet> src = Arrays.asList(new Doge("Sharik"), new Kitty("Barsik"));
        List<Pet> dest = new ArrayList<>();
        copy(dest, src);
        for(Pet p: dest) {
            p.call();
        }


        System.out.println();

        List<Kitty> src2 = Arrays.asList(new Kitty("Barsik"), new Kitty("Tom"));
        List<Pet> dest2 = new ArrayList<>();
        copy(dest2, src2);
        for(Pet p: dest2) {
            p.call();
        }

        System.out.println();

        List<Kitty> src3 = Arrays.asList(new Kitty("Barsik"), new Kitty("Tom"));
        List<Doge> dest3 = new ArrayList<>();
        // так нельзя копировать!
        // copy(dest3, src3);
        for(Doge doge: dest3) {
            doge.bark();
        }

        System.out.println();

        List<Kitty> src4 = Arrays.asList(new Kitty("Barsik"), new Kitty("Tom"));
        List<Animal> dest4 = new ArrayList<>();
        copy(dest4, src4);
        for(Animal a: dest4) {
            a.feed();
        }
    }

    public static <T> void copy(List<? super T> dest, List<? extends T> src) {
        int srcSize = src.size();
        for (int i = 0; i < srcSize; i++) {
            T elem = src.get(i);
            dest.add(i, elem);
        }
    }
}
