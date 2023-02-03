package comparator;

import java.util.Comparator;

public class CatByAgeWeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        //if (o1.getAge() != o2.getAge())
        return Integer.compare(o1.getAge(), o2.getAge());

    }
}
