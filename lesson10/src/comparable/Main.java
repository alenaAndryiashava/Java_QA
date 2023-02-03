package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pair> pairs = new ArrayList<>();

        pairs.add(new Pair("abc", 4));
        pairs.add(new Pair("ab", -5));
        pairs.add(new Pair("abc", 8));
        pairs.add(new Pair("bc", 3));
        pairs.add(new Pair("ac", 1));
        pairs.add(new Pair("ac", 9));

//        List<Comparable<Pair>> list = new ArrayList<>()
//        list.add(new Pair("a", 4));

        Collections.sort(pairs);


        System.out.println(pairs);

        // in Comparable
        // 1) we can have only one implementation
        // 2) we can compare different classes (not a case)
        // 3) we have access to private fields

        // Task
        // Write a class to represent Rectangle
        // x, y - coordinated of bottom left corner
        // width
        // height
        // implement compareTo so
        // compare by x, then by y, then by square
    }
}

