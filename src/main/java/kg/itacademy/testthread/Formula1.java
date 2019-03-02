package kg.itacademy.testthread;

class Counter implements Runnable{
    private int place = 0;

    public synchronized void inc() {
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        place++;
    }

    public int getValue() {
        return place;
    }

    @Override
    public void run() {
        this.inc();
        System.out.println("Я "
                + Thread.currentThread().getName() +
                ", я занял " + this.getValue() + " место");
    }
}

public class Formula1{
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(counter, "Lewis Hamilton");
        t1.setPriority(Thread.MIN_PRIORITY);
        Thread t2 = new Thread(counter, "Kimi Raikonen");
        t2.setPriority(Thread.MAX_PRIORITY);
        Thread t3 = new Thread(counter, "Daniel Riccardo");
        Thread t4 = new Thread(counter, "Max Verstappen");
        Thread t5 = new Thread(counter, "Michael Vettel");
        t1.start();

        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t3.start();
        t4.start();
        t5.start();
        Object o = new Object();

        o.notify();
    }
}