package chapter7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by EBR3556 on 18/07/2017.
 */
public class Sort {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Esteban");
        names.add("Diana");
        names.add("Juan");
        names.add("Jose");
        names.add("Maria");

        System.out.println(names);
        //JAVA 6
//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String name1, String name2) {
//                return name1.compareTo(name2);
//            }
//        });

        //JAVA 8 using collections
        Collections.sort(names, (name1, name2) -> name1.compareTo(name2));
        //JAVA 8 using sort in List
        names.sort((name1, name2) -> name1.compareTo(name2));

        System.out.println(names);

    }
}
