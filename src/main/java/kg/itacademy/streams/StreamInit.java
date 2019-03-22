package kg.itacademy.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamInit {
    public static void main(String[] args) {
        String[] arrayOfStr = {"Alex", "Sam", "Lewis"};
        Stream.of(arrayOfStr);










        /*List<String> list = Arrays.asList(arrayOfStr);
        //list.stream();
        list.stream().forEach(x -> System.out.printf("%s, ", x));
        list.stream().map(x -> x.toLowerCase()).forEach(x -> System.out.println(x));
        //System.out.println(list.contains("Alox"));
        //System.out.println(list.contains("Alex"));

        Stream.of(1, 2, 3);

        Stream.Builder<String> strStreamBuilder = Stream.builder();
        strStreamBuilder.accept("Юля");
        strStreamBuilder.accept("Саша");
        strStreamBuilder.accept("Хлоя");
        Stream<String> strStream = strStreamBuilder.build();



        IntStream intStream = IntStream.of(1,2,3);
        intStream.forEach(x -> System.out.println(x*x));*/
        ;

    }
}
