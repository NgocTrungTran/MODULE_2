package BTArrayList;


public class TestMyList {
    public static void main(String[] args) {

        MyArrayList<Integer> myArrayList = new MyArrayList<> ();
        myArrayList.add ( 4 );
        myArrayList.add ( 2 );
        myArrayList.add ( 5 );
        myArrayList.add ( 8 );

//        System.out.println (myArrayList);
        MyArrayList<Integer> newarr =  myArrayList.clone ();
        for (int i = 0; i < newarr.size (); i++) {
            System.out.print (newarr.get ( i ) + " ");
        }
        System.out.println ("");
        System.out.println (newarr.contains ( 5 ));

        System.out.println (newarr.indexOf ( 5 ));

        System.out.println ( myArrayList.remove ( 6 ));

    }
}
//        System.out.println ( myArrayList.size ());
//        System.out.println ( myArrayList.get ( 2 ));
//        System.out.println ( myArrayList.indexOf ( 5 ));
//        System.out.println ( myArrayList.remove ( 1 ));

//
//        myArrayList.add ( 3,1 );
//        System.out.println ( myArrayList.contains ( 3 ));
//
//
//        myArrayList.clear ();
//
//        MyArrayList<Integer> list = myArrayList.clone ();
//        System.out.println(list);



//    ArrayList<Object> ar = new Arrlist<> ();
//    ar.add()

