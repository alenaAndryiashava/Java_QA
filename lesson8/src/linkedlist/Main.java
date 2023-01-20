package linkedlist;



public class Main {
    public static void main(String[] args) {
        Node head = new Node();
        head.setData("head");
        MyLinkedList list = new MyLinkedList(head);
        System.out.println("Just head:");
        list.printList();

        System.out.println();
        System.out.println("After adding to the beginning:");
        list.add("hello");
        list.printList();

        System.out.println();
        System.out.println("After adding to the tail:");
        list.pushToTail("world");
        list.printList();

        System.out.println();
        System.out.println("Removing first element");
        list.removeFirst();
        list.printList();


        System.out.println(list.size());
    }

}
