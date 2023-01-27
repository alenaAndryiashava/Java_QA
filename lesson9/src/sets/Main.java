package sets;

import java.util.*;

import static java.lang.Long.MAX_VALUE;

public class Main {
    public static void main(String[] args) {
       /* Set<Integer> set = new HashSet<>();

        set.add(6);
        set.add(5);
        set.add(5);


        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(5);
        list.add(5);

        System.out.println("Set = " + set);
        System.out.println("List = " + list);

        System.out.println("set contains(5) " + set.contains(5));
        System.out.println("set contains(4) " + set.contains(5));

        for (Integer i :set) {
            System.out.println("I'm number from set " + i);
        }

        for (Integer i :list) {
            System.out.println("I'm number from list " + i);
        }


        eleminateDuplicates();
        eleminateDuplicatesString();
        deduplicatePerson();
        System.out.println("Remove element");
        removePerson();

        */

        filteringOrders();





    }
    public static void eleminateDuplicates() {
        // create list of 10 elements with duplicates
        List<Integer> integerList = new ArrayList<>();
        integerList.add(6);
        integerList.add(5);
        integerList.add(5);
        integerList.add(7);
        integerList.add(5);
        integerList.add(6);
        integerList.add(5);
        integerList.add(1);
        integerList.add(7);
        integerList.add(5);
        // create empty set
        Set<Integer> integerSet = new HashSet<>();
        // add elements from list to set in foreach cycle
        for (Integer i :integerList) {
            integerSet.add(i);

        }
        // print list and set contents
        System.out.println("set contains " + integerSet);
        System.out.println("list contains " + integerList);


    }
    public static void eleminateDuplicatesString() {
        // create list of 10 elements with duplicates
        List<String> words = new ArrayList<>();
        words.add("hello");
        words.add("words");
        words.add("word");
        words.add("hey");
        words.add("hole");
        words.add("hello");
        words.add("words");
        words.add("word");
        words.add("hey");
        words.add("hole");
        // create empty set
        // add elements from list to set in foreach cycle
        Set<String> wordsSet = new HashSet<>(words);
        // print list and set contents
        System.out.println("set contains " + wordsSet);
        System.out.println("list contains " + words);
    }

    public static void deduplicatePerson() {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person(23, "test@gmail.com", "Alice", "Redo"));
        persons.add(new Person(26, "bob@gmail.com", "Bob", "Fito"));
        persons.add(new Person(23, "test@gmail.com", "Alice", "Redo"));

        // create empty set
        // add elements from list to set in foreach cycle
        Set<Person> personSet = new HashSet<>(persons);
        // print list and set contents
        for (Person p : personSet) {
            System.out.println("Set contains: " + p);
        }
        for (Person personsList : persons) {
            System.out.println("list contains " + personsList);
        }
    }
    public static void removePerson() {

        Set<Person> persons = new HashSet<>();
        persons.add(new Person(23, "test@gmail.com", "Alice", "Redo"));
        persons.add(new Person(26, "bob@gmail.com", "Bob", "Fito"));
        persons.add(new Person(23, "test@gmail.com", "Alice", "Redo"));
        persons.add(new Person(45, "charlie@gmail.com", "Charlie", "Chester"));

        persons.remove(new Person(45, "charlie@gmail.com", "Charlie", "Chester"));
        for (Person p : persons) {
            System.out.println("Set contains: " + p);
        }
    }

    public static void filteringOrders() {
        // create class Order(String address, float price, long duration)

        // create 3 different orders and add them to Set
        Set<Order> orderSet = new HashSet<>();
        Order order1 = new Order("Berlin", 25, 40);
        Order order2 = new Order("Dresden", 20, 600);
        Order order3 = new Order("Berlin", 65, 150);
        orderSet.add(order1);
        orderSet.add(order2);
        orderSet.add(order3);

        // remove the order with the lowest duration
        long current = MAX_VALUE;
        Order lowestDurationOrder = null;
        for (Order o: orderSet)
             if(o.getDuration()<current){
            current = o.getDuration();
            lowestDurationOrder = o;
        }
        //orderSet.remove(lowestDurationOrder);
        orderSet.remove(new Order(null, 0,current));

        System.out.println(orderSet);


        }

        private static void arrayToSet(){
        Integer [] arr = new Integer[]{6,9,3,2};
        Set<Integer>firstApproach = new HashSet<>();
            for (int i = 0; i < arr.length; i++) {
                firstApproach.add(arr[i]);

            }
            Set<Integer> secondApproach = new HashSet<>(Arrays.asList(arr));
        }


}