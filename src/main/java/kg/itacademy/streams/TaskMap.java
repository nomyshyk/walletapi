package kg.itacademy.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student{
    int id;
    String fio;
    int mark;

    public Student(int id, String fio, int mark) {
        this.id = id;
        this.fio = fio;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}

public class TaskMap {
    public static void main(String[] args) {
        Stream.of(1800, 78, 754)
                .map(x -> x * 0.1)
                .forEach(System.out::println);

        Stream.of("Оля", "Юля")
                .map(s -> s + s)
                .forEach(System.out::println);

        Student[] students = {new Student(1, "One", 4),
                new Student(2, "Two", 5),
                new Student(3, "Three", 3)};

        List<String> list = Stream.of(students)
                .map(t -> t.getFio())
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
