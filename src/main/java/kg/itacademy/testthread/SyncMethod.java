package kg.itacademy.testthread;

/*class Message{
    public *//*synchronized*//* void displayMsg(String msg){
        System.out.println("В методе display "
                + Thread.currentThread().getName());
        System.out.println("**" + msg);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("*");
    }
}*/

class Message{
    public void displayMsg(String msg){
        System.out.println("В методе display " +
                Thread.currentThread().getName());
        synchronized(this){
            System.out.println(Thread.currentThread().getName()+
                    "**" + msg);
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"*");
        }
    }
}

class MyClass implements Runnable{
    Thread t;
    Message msg;
    String message;
    MyClass(Message msg, String str){
        this.msg = msg;
        this.message = str;
        // будет создано 4 потока
        // все используют один объект
        t = new Thread(this);
        t.start();
    }
    @Override
    public void run() {
        msg.displayMsg(message);
    }
}

public class SyncMethod {
    public static void main(String[] args) {
        Message msg = new Message();
        MyClass mc1 = new MyClass(msg, "Я");
        MyClass mc2 = new MyClass(msg, "вообще");
        MyClass mc3 = new MyClass(msg, "не");
        MyClass mc4 = new MyClass(msg, "синхронихирован");
    }
}
