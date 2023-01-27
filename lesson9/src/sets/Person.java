package sets;

public class Person {
    private int age;
    private String email;
    private String name;
    private String surname;

    public Person(int age, String email, String name, String surname) {
        this.age = age;
        this.email = email;
        this.name = name;
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Age = " + age + " email = " + email +
                " name/surname = " + name + "/" + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        return email.equals(person.email);
    }

    @Override
    public int hashCode() {
        return email.hashCode();
    }
}
