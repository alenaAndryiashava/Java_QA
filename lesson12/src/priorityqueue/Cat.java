package priorityqueue;

public class Cat {
    private int age;
    private double weight;

    public Cat(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", weight=" + weight +
                '}';
    }
}
