public class Main {


    public static void main(String[] args) {
        int a = 6;
        int b = 7;
        int c = a++ + ++b + (a++ + b++)*2;
        System.out.println (a++);
        System.out.println (++b);
        System.out.println (b++);
        System.out.println (c);
    }

}
