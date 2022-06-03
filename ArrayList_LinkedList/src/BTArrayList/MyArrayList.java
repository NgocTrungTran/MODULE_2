package BTArrayList;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int size) {
        elements = new Object[size];
    }
    public MyArrayList(int size, Object[] elements) {
        this.size = size;
        this.elements = elements;
    }

    public void ensureCapacity() {
        if ( size > elements.length ) {
            elements = Arrays.copyOf ( elements, size * 2 );
        }
    }

    public void add(E element) {
        size += 1;
        ensureCapacity ();
        elements[size - 1] = element;
    }

    public boolean remove(int index) {
        if ( index >= 0 && index <= size ) {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            size -= 1;
            return true;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public MyArrayList clone() {
        MyArrayList newMylist = new MyArrayList<> ();
        for (Object element : elements) {
            if ( element != null ) {
                newMylist.add ( element );
            }
        }
        return newMylist;
    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if ( elements[i].equals ( o ) ){
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if ( elements[i].equals ( o ) ){
                return i;
            }
        }
        return -1;
    }

    public boolean add(E element, int index) {
        if ( index >= 0 && index < size ) {
            size += 1;
            ensureCapacity ();
            for (int i = size - 2; i >= index ; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = element;
            return true;
        }
        return false;
    }

    public Object get(int i) {
        if ( i >= 0 && i <= size ) {
            return elements[i];
        }
        return null;
    }

    public void clear() {
        elements = (Object[]) new Object [DEFAULT_CAPACITY];
        size = 0;
    }
    public Object[] toArray() {
        return Arrays.copyOf(elements, size);
    }
}
