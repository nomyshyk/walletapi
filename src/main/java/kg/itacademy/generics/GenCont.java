package kg.itacademy.generics;

class GenericMethod {
    public static < T > void printArr( T[] arr ) {
        for(T element : arr) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'П', 'Р', 'И', 'В', 'Е', 'T' };

        System.out.println("integerArray :");
        printArr(intArray);

        System.out.println("\ndoubleArray:");
        printArr(doubleArray);

        System.out.println("\ncharacterArray:");
        printArr(charArray);
    }
}
