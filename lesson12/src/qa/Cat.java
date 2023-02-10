package qa;

public class Cat implements Comparable{
    private double weight;
    private int age;

    public Cat(double weight, int age) {
        this.weight = weight;
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", age=" + age +
                '}';
    }
}
