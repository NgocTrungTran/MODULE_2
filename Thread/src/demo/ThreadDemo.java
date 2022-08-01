package demo;

//Tạo luồng mới thừa kế từ lớp Thread
public class ThreadDemo extends Thread{
    private Thread t;
    private String threadName;

    public ThreadDemo(String name) {
        this.threadName = name;
        System.out.println ("Tạo " + threadName);
    }
    @Override
    public void run() {
        System.out.println ("Đang chạy " + threadName);
        try {
            for (int i = 10; i > 0; i--) {
                System.out.println (threadName + ", " + i);
// Tạm ngừng luồng 1s
                Thread.sleep ( 1000 );
            }

        } catch (InterruptedException e) {
            System.out.println ("Thread " + threadName + " interupted.");
        }
        System.out.println ("HAPPY NEW YEAR!!!");
        try {
            Thread.sleep ( 1000 );
        } catch (InterruptedException e) {
            throw new RuntimeException ( e );
        }
        System.out.println (threadName + " kết thúc.");
    }
    public void start() {
        System.out.println ("Bắt đầu " + threadName);
        if ( t == null ) {
            t = new Thread (this, threadName);
            t.start ();
            System.out.println ("Tên của luồng là: " + t.getName ());
        }
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo1 = new ThreadDemo ( "Luồng 1" );
        threadDemo1.start ();

//        ThreadDemo threadDemo2 = new ThreadDemo ( "Luồng 2" );
//        threadDemo2.start ();

    }
}
