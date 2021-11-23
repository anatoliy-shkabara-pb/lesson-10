package s11restrictions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        // Ограничения на использоване обобщений

        // 1) Cannot Instantiate Generic Types with Primitive Types
        //List<int> list = new ArrayList<int>();


        // 2) Cannot Create Instances of Type Parameters
        List<String> ls = new ArrayList<>();
        //append(ls);

        // As a workaround, you can create an object of a type parameter through reflection:
        append(ls, String.class);


        // 3) Cannot cast to a parameterized type unless it is parameterized by unbounded wildcards
         //List<Integer> li = new ArrayList<>();
         //List<Number>  ln = (List<Number>) li;  // compile-time error

        // However, in some cases the compiler knows that a type parameter is always valid and allows the cast
        List<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = (ArrayList<String>)l1;  // OK


        // 4) Cannot Create Arrays of Parameterized Types
        // List<Integer>[] arrayOfLists = new List<Integer>[2];  // compile-time error

        //Object[] stringLists = new List<String>[];  // compiler error, but pretend it's allowed
        // stringLists[0] = new ArrayList<String>();   // OK
        // stringLists[1] = new ArrayList<Integer>();  // An ArrayStoreException should be thrown, but the runtime can't detect it.




        // 5) Cannot Create, Catch, or Throw Objects of Parameterized Types
        // Extends Throwable indirectly
        //class MathException<T> extends Exception { /* ... */ }    // compile-time error

        // Extends Throwable directly
         //class QueueFullException<T> extends Throwable { /* ... */ // compile-time error


    }


//  2)  Cannot Create Instances of Type Parameters

//    public static <E> void append(List<E> list) {
//        E elem = new E();  // compile-time error
//        list.add(elem);
//    }

    public static <E> void append(List<E> list, Class<E> cls) throws Exception {
        E elem = cls.newInstance();   // OK
        list.add(elem);
    }



// 3) Cannot verify which parameterized type for a generic type is being used at runtime:

    public static <E> void rtti2(List<E> list) {
//        if (list instanceof ArrayList<Integer>) {  // compile-time error
//            // ...
//        }
    }

    public static void rtti(List<?> list) {
        if (list instanceof ArrayList<?>) {  // OK; instanceof requires a reifiable type
            // ...
        }
    }


    // 5) A method cannot catch an instance of a type parameter

//    public static <T extends Exception, J> void execute(List<J> jobs) {
//        try {
//            for (J job : jobs) {
//                // ...
//            }
//        } catch (T e) {   // compile-time error
//            // ...
//        }
//    }

    // However, use a type parameter in a throws clause:
    class Parser<T extends Exception> {
        public void parse(File file) throws T {     // OK
            // ...
        }
    }


    // 6) Cannot Overload a Method Where the Formal Parameter Types of Each Overload Erase to the Same Raw Type
//     public void print(List<String> strSet) { }
//     public void print(List<Integer> intSet) { }
}
