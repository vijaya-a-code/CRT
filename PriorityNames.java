class MyThread extends Thread {
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName() +
                           " | Priority: " + Thread.currentThread().getPriority());

        for (int i = 1; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " is running " + i);
        }
    }
}

public class PriorityNames {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        MyThread t4 = new MyThread();

        t1.setName("Worker-1");
        t2.setName("Worker-2");
        t3.setName("Worker-3");
        t4.setName("Worker-4");

        t1.setPriority(Thread.MIN_PRIORITY); // 1 (Lowest)
        t2.setPriority(Thread.MAX_PRIORITY); // 10 (Highest)
        t3.setPriority(Thread.NORM_PRIORITY); // 5 (Default)
        t4.setPriority(8); // High priority

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
