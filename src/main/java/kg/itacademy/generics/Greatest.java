package kg.itacademy.generics;

class Greatest {
    public static <T extends Comparable<T>> T greatest(T x, T y, T z) {
        T max = x;   // Пока x - максимальное значение
        if(y.compareTo(max) > 0) {
            max = y;   // значит Y больше X
        }
        if(z.compareTo(max) > 0) {
            max = z;   // Значит Z больше всех
        }
        return max;   // вернуть самый макс элемент
    }
    public static void main(String args[]) {
        System.out.printf("Крупнейшее из %d, %d и %d это %d\n\n",
                3, 4, 5, greatest( 3, 4, 5 ));
        System.out.printf("Крупнейшее из %.1f,%.1f и %.1f это %.1f\n\n",
                6.6, 8.8, 7.7, greatest( 6.6, 8.8, 7.7 ));
        System.out.printf("Крупнейшее из %s, %s и %s это %s\n","шапка",
                "туфли", "куртка", greatest("Шапка", "туфли", "куртка"));
        //greatest( new Greatest(), new Greatest(), new Greatest())
    }
}
