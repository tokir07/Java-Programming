package Threads;

class Task extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " Priority: " + Thread.currentThread().getPriority());
    }
}

public class Thread_Priority {
    public static void main(String[] args) {
        Task t1 = new Task();
        Task t2 = new Task();

        t1.setName("Low Priority Thread");
        t2.setName("High Priority Thread");

        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.MAX_PRIORITY); // 10

        t1.start();
        t2.start();
    }
}
