package stack;

public class RatedByUser {
    private final double rating;
    private final String name;

    public RatedByUser(double rating, String name) {
        this.rating = rating;
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "RatedByUser{" +
                "rating=" + rating +
                ", name='" + name + '\'' +
                '}';
    }
}
