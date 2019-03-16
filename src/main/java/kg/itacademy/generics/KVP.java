package kg.itacademy.generics;

import java.util.ArrayList;
import java.util.List;

public class KVP<T3, U2> {
    T3 o1;
    U2 o2;

    public KVP(T3 o1, U2 o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    public KVP() {
    }

    public T3 getO1() {
        return o1;
    }

    public U2 getO2() {
        return o2;
    }

    public static void main(String[] args) {
        KVP<String, Integer>  kvp1 =
                new KVP<String, Integer>("Ha", 1);
        KVP<String, String>  kvp2 =
                new KVP<String, String>("Ha", "1");

        KVP<String, Integer>  kvp3 =
                new KVP<String, Integer>();
        kvp3.o1 = "haha";

        List<String> myList = new ArrayList<>(10);
        List myListO = new ArrayList(10);
        myListO.add(new Object());
        myListO.add(1);
        myListO.add("Ha");

    }
}
