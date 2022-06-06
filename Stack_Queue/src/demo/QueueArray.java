package demo;

public class QueueArray {
    private int[] arr;
    private int size;
    private int index = 0;

    public QueueArray(int size) {
        this.size = size;
        arr = new int[size];
    }

    public boolean isQueueFull() {
        if ( index == size ) {
            return true;
        }
        return false;
    }

    public boolean isQueueEmpty() {
        if ( index == 0 ) {
            return true;
        }
        return false;
    }

    public boolean offer(int element) {
        if ( isQueueFull () ) {
            return false;
        }
        arr[index] = element;
        index++;
        return true;
    }
    public void peek(){
        if ( isQueueEmpty() ) {
            System.out.println ("null");
        }
        else {
            System.out.println ( arr[0] );
        }
    }

    public static void main(String[] args) {
        QueueArray queueArray = new QueueArray(5);
        queueArray.peek ();
        queueArray.offer ( 45 );
        queueArray.offer ( 42 );
        queueArray.offer ( 12 );
        queueArray.offer ( 13 );
        for (int e: queueArray.arr) {
            System.out.print (e + " ");
        }
        System.out.println ("");
        System.out.println (queueArray.offer ( 13 ));
        for (int e: queueArray.arr) {
            System.out.print (e + " ");
        }
        System.out.println ();
        queueArray.peek ();
    }
}
