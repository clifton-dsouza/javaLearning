class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " -> run(): " + i);
        }
    }
}

public class nums {
    public static void main(String[] args) {
        MyThread t = new MyThread();

        System.out.println("Before t.run()");
        t.run();   // runs in main thread
        System.out.println("After t.run()");

        System.out.println("Before t.start()");
       
        t.start(); // runs in a new thread
        System.out.println("After t.start()");
    }
}  