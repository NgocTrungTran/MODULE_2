package demo;

import java.util.ArrayDeque;

public class QueueArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> myQueue = new ArrayDeque<> ();
// Thêm phần tử vào Queue
        myQueue.offer ( "Codegym" );
        myQueue.offer ( "Raising" );
        myQueue.offer ( "the" );
        myQueue.offer ( "bar" );

//        Lấy phần tử đầu của queue
        System.out.println ("First element: " + myQueue.peek ());
        for (String e: myQueue) {
            System.out.print (e + " ");
        }
        System.out.println ("");

        System.out.println ("");
//        hoặc lấy phần tử đầu và xóa khỏi queue
        System.out.println ("First element: " + myQueue.poll ());
        for (String e: myQueue) {
            System.out.print (e + " ");
        }
//        System.out.println ("");
//        myQueue.clear ();
////        System.out.println ("First element: " + myQueue.peek ());
    }
}
