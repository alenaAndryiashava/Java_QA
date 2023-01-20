package linkedlist;

public class MyLinkedList {
    private Node head;

    public MyLinkedList(Node head) {
        this.head = head;
    }
    /*add new element to the beginning of list
            example
                  "hello" -> "world" (head = "hello")
                  .add("Hey!")
                  "Hey" -> "hello" -> "world" (head = "Hey")
                      */

    public void add(String s){
        // create new node with s
        Node current = new Node(); //create new node
        current.setData(s); //new node with s
        // set new head to the new node
        Node previousHead = head; // wrote down the value head in previousHead
        head = current;    // new node is head
        // set previous head as next of new head
       current.setNext(previousHead);

    }
    public void pushToTail(String s){
        // go from head until next = null
        Node last = head;
        while (last.getNext() != null){
            last = last.getNext();
        }
        // create new element
        Node current = new Node();
        current.setData(s);

        // set to tail
        last.setNext(current) ;

    }
    public void removeFirst(){
        Node newHead = head.getNext();
        head = newHead;

    }
    public int size(){
        Node node = head;
        int numberOfElement = 0;
        while (node != null){
            node = node.getNext();
            numberOfElement +=1;
        }
        return numberOfElement;
    }


    public void printList(){
        Node node = head;
        do {
            System.out.println(node.getData());
            node =  node.getNext();
        }
        while (node != null);
    }

}

