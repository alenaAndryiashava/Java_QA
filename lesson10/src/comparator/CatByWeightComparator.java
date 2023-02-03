package comparator;

import java.util.Comparator;

public class CatByWeightComparator implements Comparator<Cat> {

    // -1 means o1 < o2
    // 0 means o1 = o2
    // 1 means o1 > o2

    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.getWeight() < o2.getWeight()) {
            return -1;
        } else if (o1.getWeight() > o2.getWeight()) {
            return 1;
        } else {
            return 0;

            //return Double.compare(o1.getWeight(), o2.getWeight());
        }
    }

}
