package kg.itacademy.testthread;

public class FirstThread extends Thread{

    @Override
    public void run(){
        System.out.println("Я созданный поток");
    }

    public static void main(String[] args) {
        System.out.println(1);
        FirstThread fs = new FirstThread();
        fs.start();
        System.out.println("Я основной поток");
    }
}
