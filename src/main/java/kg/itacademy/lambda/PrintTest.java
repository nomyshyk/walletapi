package kg.itacademy.lambda;

@FunctionalInterface
interface Printable{
    void print(String text);
}

@FunctionalInterface
interface BanalPrintable{
    String print();
}

@FunctionalInterface
interface NewPrintable{
    String print(int year);
}

public class PrintTest {
    public static void main(String[] args) {
        Printable printable =
                (text -> System.out.println(text));
        BanalPrintable banalPrintable =
                () -> "Я старый принтер";

        NewPrintable newPrintable =
                (year) -> {
                    return (year < 2015) ? "Я старый принтер"
                            : "Я новый принтер";
                    /*if(year<2015)
                        return "Я старый принтер";
                    else {
                        return "Я новый принтер";
                    }*/
                };

        printable.print("Проверочная страница печати");
        System.out.println(banalPrintable.print());
        System.out.println(newPrintable.print(2017));
    }


}
