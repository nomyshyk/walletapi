package kg.itacademy.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskFilter {
    public static void main(String[] args) {
        Student[] students = {new Student(1, "One", 4),
                new Student(2, "Two", 5),
                new Student(3, "Three", 2)};
        Stream.of(students)
                .filter(x -> x.getMark()>=4)
                .forEach(x -> System.out.println(x.getFio()));
        long i = Stream.of(students)
                .filter(x -> x.getMark()<=2).count();
        System.out.println(i);

    }
}
