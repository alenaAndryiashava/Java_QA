package comparable;

import java.util.Objects;

public class Pair implements Comparable<Pair>{
    private final String str;
    private final int num;

    public Pair(String str, int num) {
        this.str = str;
        this.num = num;
    }

    public String getStr() {
        return str;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "name='" + str + '\'' +
                ", age=" + num +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;

        Pair pair = (Pair) o;

        if (num != pair.num) return false;
        return Objects.equals(str, pair.str);
    }

    @Override
    public int hashCode() {
        int result = str != null ? str.hashCode() : 0;
        result = 31 * result + num;
        return result;
    }

    @Override
    public int compareTo(Pair other) {
        if(this.str.equals(other.str)){
           return Integer.compare(this.num, other.num);

            }else {
            return this.str.compareTo(other.str);

        }
    }
}
