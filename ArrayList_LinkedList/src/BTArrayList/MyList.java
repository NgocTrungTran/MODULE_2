package BTArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if ( capacity > 0 ) {
            elements = new Object[capacity];
            System.out.println ( "Compeled!" );
        } else {
            System.out.println ( "Invalid!" );
            throw new IllegalArgumentException ();
        }
    }

    public void add(int index, E elements) {

    }

    public E remove(int index) {

    }

    public int size() {

    }

    public E clone() {

    }

    public boolean contains(E o) {

    }

    public int indexOf(E o) {

    }

    public boolean add(E e) {

    }

    public void ensureCapacity(int minCapacity) {
        minCapacity = elements.length * 2;
        elements = Arrays.copyOf (elements, minCapacity);
    }

    public E get(int i) {

    }

    public void clear() {

    }
}
