package kg.itacademy.lambda;

@FunctionalInterface
interface Testable {
    void test(String name);
}

class Student implements Testable {

    @Override
    public void test(String name) {

        System.out.printf("\nЯ Студент %s сдаю тест", name);
    }
}

public class Anonym {
    public static void main(String[] args) {
        Student ivan = new Student();
        ivan.test("Иван");

        Testable anon = new Testable() {
            @Override
            public void test(String name) {
                System.out.printf("\nЯ не студент, %s сдаю тест", name);
            }
        };
        anon.test("Petr");
        anon.test("Sergey");

        Testable anonLambda =
                (name) ->
                {
                    System.out.printf
                            ("\nЯ учёный, %s но сдаю тест", name);
                };
        anonLambda.test("Хаскелл Карри");
        anonLambda.test("Алонсо Чёрч");
    }
}
