package BTLinkedList;


import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyLinkedList {
    private Node head;
    private int numNodes;
    private boolean flag;

    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public MyLinkedList() {

    }

    public MyLinkedList(Object data) {
        head = new Node ( data );
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node ( data );
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node ( data );
        head.next = temp;
        numNodes++;
    }

    public void addLast(Object data) {
        if ( head == null )
            addFirst ( data );
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = new Node ( data );
        }
    }

    public void remove(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        assert temp.next != null;
        temp.next = temp.next.next;
        numNodes--;
    }

    public boolean remove(Object data) {
        Node temp = head;
        int index = indexOf ( data );
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        assert temp.next != null;
        temp.next = temp.next.next;
        numNodes--;
        return true;
    }

    public int size() {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            temp = temp.next;
            i++;
        }
        return i;
    }

    public MyLinkedList clone() {
        MyLinkedList clone = new MyLinkedList ();
        clone.addFirst ( head.data );
        for (int i = 1; i < numNodes; i++) {
            Node temp = null;
            clone.addLast ( temp.data );
        }
        return clone;
    }

    public boolean contains(Object data) {
        Node temp = head;
        for (int i = 0; i <= numNodes; i++) {
            if ( (temp.data).equals ( data ) ) {
                flag = true;
                break;
            } else {
                flag = false;
                temp = temp.next;
            }
        }
        return flag;
    }

    public int indexOf(Object data) {
        Node temp = head;
        int index = -1;
        for (int i = 0; i <= numNodes; i++) {
            if ( (temp.data).equals ( data ) ) {
                index = i;
                break;
            } else {
                temp = temp.next;
            }
        }
        return index;
    }

    public void get(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) temp = temp.next;
        System.out.println ( temp.data );
    }

    public Object getFirst() {
        Node temp = head;
        Object first = null;
        if ( temp != null ) {
            first = temp.data;
        }
        return first;
    }

    public Object getLast() {
        Node lastTemp = head;
        Object last = null;
        if ( head != null ) {
            while (lastTemp.next != null) {
                lastTemp = lastTemp.next;
            }
            last = lastTemp.data;
        }
        return last;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print ( temp.data + " " );
            temp = temp.next;
        }
    }
}
