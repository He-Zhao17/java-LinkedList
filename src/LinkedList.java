import java.util.NoSuchElementException;
import java.util.List;

public class LinkedList<Type> {

    private Node head;
    private Node tail;

    class Node<Type> {
        Type data;
        Node next;
        Node prev;
        Node tail; // you will need to figure out how to hook this up.

        Node(Type d) {
            this.data = d;
        }

    }

    public LinkedList() {
        head = null;
        tail = null;
    }


   // your methods will go here.



}
