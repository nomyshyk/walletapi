package kg.itacademy.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskCollect {
    public static void main(String[] args) {
        Integer[] ints = {10, 60, 56, 87, 90};
        //List<Integer> iss =
         Long c = Stream.of(ints).map(x ->
        { if (x%3 == 0)
        {
            return 0;
        }
        else return 10*x;})
                .filter(x -> x != 0)
                        .count();
                //.collect(Collectors.toList());

        System.out.println(c);
    }
}
