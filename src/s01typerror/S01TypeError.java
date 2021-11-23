package s01typerror;

import java.util.ArrayList;
import java.util.List;

public class S01TypeError {

    public static void main(String[] args) {
        //Без дженериков
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add(3);

        String v1 = (String) list.get(0);
        String v2 = (String) list.get(1);
        // ClassCastException
        // String v3 = (String) list.get(2);



        //C использованием дженериков
        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        // Ошибка компиляции
        // list2.add(3);

        String s1 = list2.get(0);
        String s2 = list2.get(1);
        String s3 = list2.get(2);
    }
}
