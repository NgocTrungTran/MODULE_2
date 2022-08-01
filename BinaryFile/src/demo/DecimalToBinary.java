package demo;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public void stackBinaryConvert(int decimal) {
        Stack<Integer> stack = new Stack<>();
        if (decimal <= 0) System.out.print(0);
        else {
            while (decimal > 0) {
                stack.push((decimal % 2));
                decimal /= 2;
            }
            while (!stack.isEmpty()) System.out.print(stack.pop());
        }
    }
    public void manualBinaryConvert(int decimal) {
        int index = 0;
        int[] binary = new int[40];
        if (decimal <= 0) System.out.print(0);
        else {
            while (decimal > 0) {
                binary[index++] = (decimal % 2);
                decimal /= 2;
            }
            for (int i = (index - 1); i >= 0; i--) System.out.print(binary[i]);
        }
    }
    public void availableBinaryConvert(int decimal) {
        if (decimal <= 0) System.out.print(0);
        else System.out.print(Integer.toBinaryString(decimal));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalToBinary decimalToBinary = new DecimalToBinary();
        System.out.print("Type a decimal to convert to binary: ");
        int decimal = scanner.nextInt();
        System.out.print("Convert from " + decimal + " to: ");
        decimalToBinary.stackBinaryConvert(decimal);
        System.out.println();
    }
}
