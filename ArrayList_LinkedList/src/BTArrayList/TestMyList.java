package BTArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer> ( 5 );
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
        System.out.println (myList.size ());


    }
}
