package qa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat(7.7, 8));
        cats.add(new Cat(3.5, 4));
        cats.add(new Cat(8.9, 6));

        System.out.println(cats);

        Collections.sort(cats);

        System.out.println(cats);
    }
}