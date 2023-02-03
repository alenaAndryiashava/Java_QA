package comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murphy", 4,5.5);
        Cat cat2 = new Cat("Leowis", 6,6.7);
        Cat cat3 = new Cat("Ariel", 3,3.5);
        Cat cat4 = new Cat("Bob", 3,4.5);
        Cat cat5 = new Cat("Ariel", 7,4.5);

        CatByWeightComparator comparator = new CatByWeightComparator();

        List<Cat> catList = new ArrayList<>();
        catList.add(cat1);
        catList.add(cat2);
        catList.add(cat3);
        System.out.println("Before sorting " + catList);

        // How to sort a list using comparator
        // #1
//        Collections.sort(catList, comparator);
        // #2
        //catList.sort(comparator);
        //System.out.println("After sorting" + catList);



        System.out.println(sortCatsFromOldToYoung(catList));

    }

    public static List<Cat> sortCatsFromOldToYoung(List<Cat> cats) {
        CatByAgeComparator comparatorByAge = new CatByAgeComparator();
        cats.sort(comparatorByAge);
        return cats;
    }
}
