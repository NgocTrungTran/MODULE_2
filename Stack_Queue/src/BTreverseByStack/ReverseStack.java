package BTreverseByStack;

import java.util.Stack;

public class ReverseStack {
    public static String ReverseString(String string) {
        char[] reverseString = new char[string.length ()];
        Stack<Character> stack = new Stack<> ();
        for (int i = 0; i < string.length (); i++) {
            stack.push ( string.charAt ( i ) );
        }

        int i = 0;
        while (!stack.isEmpty ()){
            reverseString[i++] = stack.pop ();
        }
        return new String (reverseString);
    }

    public static void main(String[] args) {
        String string_1 = "Tran Ngoc Trung";
        System.out.println (string_1 + " After Reversing: " + ReverseString ( string_1 ));
    }
}
