package stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {


        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");
        stack.push("My dear Java");
        System.out.println("Stack" + stack);
    // pop - delete
        String poppedElement = stack.pop();
        System.out.println("popped element " + poppedElement);
        System.out.println("Stack " + stack);
    //peek - watch element at the top
        String peekedElement = stack.peek();
        System.out.println("peeked element " + peekedElement);
        System.out.println("Stack " + stack);

        System.out.println("is stack empty = " + stack.empty());
        // search demo
        //number of position from the top starting from 1
        System.out.println("Search for World " + stack.search("World"));
        System.out.println("Search for Java " + stack.search("Java"));
        System.out.println("Stack - " + stack);
        stack.push("Collection");
        stack.push("Stack");

        System.out.println("Search for World " + stack.search("World")); // 3
        System.out.println("Search for Hello " + stack.search("Hello")); // 4
        System.out.println("Stack - " + stack);

        Stack<RatedByUser> rating = getRatings();
        System.out.println(rating);
        double result = calculateNewRating(3.1, rating.peek().getRating());
        System.out.println(result);

        rating.pop();
        System.out.println(rating);
        // clear all ratings

    }

    // create class RatedByUser
    // double rating
    // string name (what did user estimate)
    // create 4 objects RatedByUser and add them to stack

    public static Stack<RatedByUser> getRatings() {
        Stack<RatedByUser> rating = new Stack<>();
        rating.push(new RatedByUser(4.6,"User1"));
        rating.push(new RatedByUser(3.5,"User2"));
        rating.push(new RatedByUser(5.0,"User3"));
        rating.push(new RatedByUser(5.1,"User4"));

        return  rating;
    }

    //Task

    // calculate as average new rating based on the most recent rating received and old rating
    public static double calculateNewRating(double previousRating, double mostRecentRating) {

        return (previousRating + mostRecentRating) / 2;
    }
}
