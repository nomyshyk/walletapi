package kg.itacademy.streams;

import java.util.stream.Stream;

public class TaskForEach {
    public static void main(String[] args) {
        Integer[] integers = {3, 5, 7, 11};
        Stream.of(integers).forEach(x -> System.out.print(x*x + " "));

        Stream.of("\nалишер", "андрей", "геннадий")
                .forEach(s -> System.out.println
                        (s.replace("а", "о")));
    }
}
