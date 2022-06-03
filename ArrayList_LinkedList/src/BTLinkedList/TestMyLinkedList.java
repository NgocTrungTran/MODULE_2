package BTLinkedList;

import THArrayListSimple.MyList;

import java.util.Iterator;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList ( "haha" );
        linkedList.add ( 1, 2 );
        linkedList.add ( 2, "ok" );
        linkedList.add ( 3, 3 );

        linkedList.addFirst ( "first" );
//        System.out.println ( linkedList.indexOf ( "first" ) );
        linkedList.addLast ( "okela" );
//        System.out.println (linkedList.contains ( "ok" ));

//        linkedList.remove ( 3 );

        linkedList.printList ();
        System.out.println ("");
        linkedList.get (3);
        linkedList.remove ( 1 );

        linkedList.printList ();
        System.out.println ("");

        System.out.println (linkedList.contains ( "haha" ));

        System.out.println (linkedList.indexOf ( 2 ));
//        linkedList.remove ( 3 );
//        linkedList.get ( 2 );
//        System.out.println ("");
//        for (int i = 0; i < linkedList.size (); i++) {
//            linkedList.get ( i );
    }
}

