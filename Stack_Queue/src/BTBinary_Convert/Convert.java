package BTBinary_Convert;

import java.util.LinkedList;
import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {

        // khởi tạo stack rỗng
        LinkedList<Object> stack = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Number need convert: ");
        int number = input.nextInt();

        // chuyển đổi từ thập phân -> nhị phân = %2
        final int NUM = number;
        while (number != 0) {
            // result => stack
            stack.push(number % 2);
            number = number / 2;
        }

        // đọc hết stack => nối chuỗi
        StringBuilder stringg = new StringBuilder ();
        while (!stack.isEmpty()) {
            stringg.append ( stack.pop () );
        }
        System.out.println("result: " + NUM +
                " = " + "("+ stringg +")" + "B");

    }
}
