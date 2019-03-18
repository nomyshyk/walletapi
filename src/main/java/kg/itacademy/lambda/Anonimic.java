package kg.itacademy.lambda;

class NotAnon implements Runnable{
    @Override
    public void run() {
        System.out.println("Обычный вызов ");
    }
}

public class Anonimic {
    public static void main(String[] args) {
        new Thread(new NotAnon() ).start();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Анонимный вызов ");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Анонимный вызов ");
            }
        });

        t1.start();
        t1.start();
    }
}
