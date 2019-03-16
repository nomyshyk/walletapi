package kg.itacademy.generics;

import java.lang.reflect.Array;

public class GenericReturn {
    public static <T> T returnLastVal( T[] arr, boolean isLast ) {
        //T[] newArray = (T[])new Object[arr.length];
        return isLast ? arr[arr.length-1] : arr[0];
    }

    public static void main(String args[]) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'П', 'Р', 'И', 'В', 'Е', 'T' };

        System.out.println(returnLastVal(intArray,true));

        System.out.println(returnLastVal(doubleArray, false));

        System.out.println(returnLastVal(charArray, false));
    }
}
