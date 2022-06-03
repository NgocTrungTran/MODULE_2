package demo;

import java.util.ArrayList;
import java.util.Collections;

public class demoArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer> (10);
        arrayList.add ( 2 );
        arrayList.add ( 6 );
        arrayList.add ( 656 );
        arrayList.add ( 34 );
        arrayList.add ( 2 );
        arrayList.add ( 65 );
        arrayList.add ( 87 );
        arrayList.add ( 3 );
        arrayList.add ( 7 );
        arrayList.add ( 27 );
        System.out.println (arrayList);

        ArrayList<Integer> newarr = (ArrayList<Integer>) arrayList.clone ();
        System.out.println (newarr);

        System.out.println (newarr.contains ( 5 ));
//        for (int i = 0; i < arrayList.size (); i++) {
//            System.out.println (arrayList.get ( i ));
//        }
//        System.out.println ("");
//
//        Collections.sort (arrayList);
//        System.out.println (arrayList);
//        Collections.reverse ( arrayList );
//        System.out.println (arrayList);
//
//        System.out.println (arrayList.get ( 4 ));
//
//        arrayList.set ( 4, 30 );
//        System.out.println (arrayList.get ( 4 ));
//
////        arrayList.clear ();
////        System.out.println (arrayList);
//
//        arrayList.remove ( 1 );
//        System.out.println (arrayList);
//
//        System.out.println (arrayList.contains ( 656 ));
//        System.out.println (arrayList.indexOf ( 2 ));
//        System.out.println (arrayList.lastIndexOf ( 2 ));
//
//        Object[] array = arrayList.toArray ();
//        for (int i = 0; i < array.length; i++) {
//            System.out.println ("array[" + i + "]" + " = " + array[i]);
//        }
    }
}
