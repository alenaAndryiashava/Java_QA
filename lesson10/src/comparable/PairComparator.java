package comparable;

import java.util.Comparator;

public class PairComparator implements Comparator<Pair> {
    @Override
    public int compare(Pair o1, Pair o2) {
        if (o1.getStr().equals(o2.getStr())) {
            return Integer.compare(o1.getNum(), o2.getNum());
        } else {
            return o1.getStr().compareTo(o2.getStr());
        }
    }
}
