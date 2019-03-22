package kg.itacademy.streams;

import java.util.stream.Stream;

public class ForEachTest {
    public static void main(String[] args) {
        String[] arrayOfStr = {"Alex", "Sam", "Lewis"};
        Stream.of(arrayOfStr)
                .forEach(xa -> System.out.print(xa + ","))
                ;
    }
}
