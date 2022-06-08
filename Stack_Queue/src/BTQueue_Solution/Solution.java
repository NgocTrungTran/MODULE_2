package BTQueue_Solution;

public class Solution {

    static class Node {
        int data;
        Node link;
    }

    static class Queue {
        Node front, rear;
    }


    static void enQueue(Queue queue, int value) {
        Node temp = new Node ();
        temp.data = value;
        if ( queue.front == null )
            queue.front = temp;
        else
            queue.rear.link = temp;

        queue.rear = temp;
        queue.rear.link = queue.front;
    }

    // Function to delete element from Circular Queue
    static int deQueue(Queue queue) {
        if ( queue.front == null ) {
            System.out.println ( "Queue is empty" );
            return Integer.MIN_VALUE;
        }

        // If this is the last node to be deleted
        int value; // Value to be dequeued
        if ( queue.front == queue.rear ) {
            value = queue.front.data;
            queue.front = null;
            queue.rear = null;
        } else  // There are more than one nodes
        {
            Node temp = queue.front;
            value = temp.data;
            queue.front = queue.front.link;
            queue.rear.link = queue.front;
        }

        return value;
    }

    // Function displaying the elements of Circular Queue
    static void displayQueue(Queue queue) {
        Node temp = queue.front;
        System.out.println ( " Elements in Circular Queue are: " );
        while (temp.link != queue.front) {
            System.out.printf ( "%d ", temp.data );
            temp = temp.link;
        }
        System.out.printf ( "%d", temp.data );
    }

    public Solution() {
    }

    /*  Driver of the program  */
    public static void main(String[] args) {
        // Create a queue and initialize front and rear
        Queue queue = new Queue ();
        queue.front = queue.rear = null;

        // Inserting elements in Circular Queue
        enQueue ( queue, 14 );
        enQueue ( queue, 22 );
        enQueue ( queue, 6 );

        // Display elements present in Circular Queue
        displayQueue ( queue );

        // Deleting elements from Circular Queue
        System.out.printf ( " Deleted value = %d", deQueue ( queue ) );
        System.out.printf ( " Deleted value = %d", deQueue ( queue ) );

        // Remaining elements in Circular Queue
        displayQueue ( queue );

        enQueue ( queue, 9 );
        enQueue ( queue, 20 );
        displayQueue ( queue );

    }
}

