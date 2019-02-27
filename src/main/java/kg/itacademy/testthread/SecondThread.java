package kg.itacademy.testthread;

public class SecondThread implements Runnable{

    @Override
    public void run(){
        for(int i = 0; i<=10; i++){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Паспорт (поток)" + " " + i+ " раз");
        }

    }

    public static void main(String[] args) {
        System.out.println(1);
        Thread t = new Thread(new SecondThread());
        t.setDaemon(true);
        t.start();
        SecondThread secondThread = new SecondThread();
        secondThread.print(10, "Диплом");
        System.out.println("Я основной поток, я закончил");
    }

    public void print (int n, String text){
        for(int i = 0; i<=n; i++){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(text + " " + i+ " раз");
        }
    }
}
