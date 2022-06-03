package demo;


import java.util.LinkedList;

public class demoLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<> ();
        linkedList.add ( "Codegym" );
        linkedList.add ( "Raising" );
        linkedList.add ( "the" );
        linkedList.add ( "bar" );
        System.out.println (linkedList);

        System.out.println (linkedList.size ());
        System.out.println (linkedList.get ( 2 ));

        linkedList.set ( 2, "home" );
        System.out.println (linkedList.get ( 2 ));

        System.out.println ("Before " + linkedList.size ());
        linkedList.add ( "Programming" );
        System.out.println ("After " + linkedList.size ());

        linkedList.addFirst ( "Code" );
        System.out.println (linkedList);
        linkedList.remove (1);

        linkedList.clone ();
        linkedList.getFirst ();
    }
}
