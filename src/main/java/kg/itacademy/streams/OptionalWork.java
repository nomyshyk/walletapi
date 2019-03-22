package kg.itacademy.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalWork {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        stringList.add("One");
        stringList.add("Two");
        stringList.add("Three");
        Stream<String> stream = stringList.stream();
        Optional<String> reduced = stream.reduce((value, combinedValue) -> {
            return combinedValue + " + " + value;
        });
        System.out.println(reduced.get());

        Stream<Integer> integerStream = Stream.of(7,8,9,10);
        Optional<Integer> summa =
            integerStream.reduce((sum, x) -> sum + x );
        System.out.println("summa = " + summa);

        /*Optional<Integer> integer = Optional.empty();
        Optional<Integer> integer1 = Optional.of(6);
        Optional<Integer> integer2 = Optional.of(5);

        System.out.println(integer.orElseThrow(()-> new RuntimeException()));
        System.out.println(integer.orElse(1));
        System.out.println(integer.isPresent());
        System.out.println(integer.get());

        List<Optional<Integer>> integerList = new ArrayList<>();
        integerList.add(integer);
        integerList.add(integer1);*/
    }
}
