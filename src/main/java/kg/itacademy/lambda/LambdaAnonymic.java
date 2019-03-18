package kg.itacademy.lambda;

public class LambdaAnonymic {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Анонимный вызов приветствует тебя");
            }
        }).start();

        new Thread(
            () -> System.out.println("Я лямбда, привет")
        ).start();


    }
}
