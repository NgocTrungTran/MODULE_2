package BTBracket;

import java.util.LinkedList;
import java.util.Scanner;

public class Bracket {
    public static void main(String[] args) {
        // 1. tạo bStack rỗng
        // 2. với mỗi ký hiệu sym trong đoạn
        LinkedList<Character> bStack = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("input string test  : ");
        String stringg = input.nextLine();
        boolean isTrue = true;
        for (int i = 0; i < stringg.length(); i++) {
            if (stringg.charAt(i) == '(') {
                // 2.1 nếu sym là dấu ngoặc trái: "("
                // 2.1.1 đưa sym vào bstack
                bStack.push(stringg.charAt(i));
            } else if (stringg.charAt(i) == ')') {
                if (bStack.size() == 0) {
                    isTrue = false;
                    break;
                } else {
                    // 2.2 nếu sym là dấu ngoặc phải ")"
                    // 2.2.1 nếu bstack rỗng, return false
                    // 2.2.2 lấy dấu ngoặc ở bstack, đưa vào biến left
                    // 2.2.3 nếu left và sym không khớp ddc với nhau, return false
                    bStack.pop();
                }
            }
        }
        if (bStack.size() != 0) {
            isTrue = false;
        }
        if (isTrue) {
            System.out.println("Well");
        } else System.out.println("???");
    }
}
