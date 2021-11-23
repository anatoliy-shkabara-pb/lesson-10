package s10unknowntype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<? extends Integer> intList = new ArrayList<>();

        // OK. List<? extends Integer> is a subtype of List<? extends Number>
        List<? extends Number>  numList = intList;


        List<Number> numbers = Arrays.asList(0, 0.5, 12.3, 30, 450);
        print(numbers);

        List<Object> objects = Arrays.asList("string", new Object[5], null, 15);
        print(objects);

    }

    //public static void print(List<Object> list) {
    public static void print(List<?> list) {
        for (Object obj: list) {
            System.out.println(obj);
        }
    }
}
