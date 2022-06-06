package THStack_Arr;

public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack ( 5 );

        stack.push ( 12345 );
        stack.push ( 1234 );
        stack.push ( 123 );
        stack.push ( 12 );
        stack.push ( 1 );


        System.out.println ( "Size: " + stack.size () );
        System.out.print ( "Elements: " );

        System.out.printf ( " %d", stack.pop () );


        System.out.println ( "\nSize after pop: " + stack.size () );

    }
}
