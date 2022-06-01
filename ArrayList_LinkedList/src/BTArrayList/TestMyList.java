package BTArrayList;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer> ( );
        myList.add ( 4 );
        myList.add ( 2 );
        myList.add ( 5 );
        myList.add ( 8 );

        System.out.println (myList.size ());
        System.out.println (myList.get ( 2 ));
        System.out.println (myList.indexOf ( 5 ));
        System.out.println (myList.remove ( 1 ));

        myList.add ( 3,1 );
        System.out.println (myList.contains ( 3 ));


        myList.clear ();

        MyList<Integer> list = myList.clone ();
        System.out.println(list);

    }
}
