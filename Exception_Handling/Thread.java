package Exception_Handling;

class A extends Thread {
    public void run() {
        System.out.println("Thread A is running");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    class B extends Thread {
        public void run() {
            System.out.println("Thread B is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

public class Thread {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.run();
        b.run();
    }
}
