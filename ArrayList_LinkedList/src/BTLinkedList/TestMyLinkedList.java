package BTLinkedList;

import THArrayListSimple.MyList;
import java.util.Iterator;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList ( "a" );
        linkedList.add ( 1,2 );
        linkedList.add ( 2, "ok" );
        linkedList.add ( 3, 3);
//        linkedList.addFirst ( "first" );
//        System.out.println (linkedList.indexOf ( "first" ));
//
//        linkedList.remove ( 3 );
//        linkedList.get ( 2 );
        System.out.println ("");
        for (int i = 0; i < linkedList.size (); i++) {
            linkedList.get ( i );
        }
    }
}
