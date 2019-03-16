package kg.itacademy.generics;

class GreatestArray {
    public static <T extends Comparable<T>> T greatest(T[] array) {
        T max = array[0];

        for(int i=1; i<array.length; i++){
            if(array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;   // вернуть самый макс элемент
    }
    public static void main(String args[]) {
        Integer[] arrI = {100, 12, 123, 2, 8};
        System.out.println(greatest(arrI));
        Double[] arrD = {100.6, 1267.4, 123.7, 2.0, 8.9};
        System.out.println(greatest(arrD));
    }
}
