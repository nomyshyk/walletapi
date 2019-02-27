package kg.itacademy.testthread;

public class FirstThread extends Thread{

    String[] persons;

    public FirstThread(String... persons){
        this.persons = persons;
    }

    @Override
    public void run(){
        for(int i = 0;  i<persons.length; i++){
            try {
                sleep(1000);
                System.out.println("Поток обслужил "+persons[i] + " "+ i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        FirstThread firstThread1 =
                new FirstThread("Оля", "Паша", "Юра", "Лена",
                        "Саша", "Маша");
        firstThread1.setPriority(MAX_PRIORITY);
        firstThread1.start();

        FirstThread firstThread2 =
                new FirstThread("James", "Alex", "John", "Joe",
                        "Nick", "Theo");
        firstThread2.setPriority(MIN_PRIORITY);
        firstThread2.start();
        System.out.println("Это Cпарта!!! (main)");
   }
}
