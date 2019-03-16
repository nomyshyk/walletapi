package kg.itacademy.generics;

import java.util.ArrayList;
import java.util.List;

class BottleOfWater {
    public BottleOfWater(int litr) {
        this.litr = litr;
    }

    public int getLitr() {
        return litr;
    }

    private int litr;
    public void fill()
    {
        System.out.println("Буль-буль " + getClass());
    }
}
class BottleOfJuice extends BottleOfWater {
    public BottleOfJuice(int litr) {
        super(litr);
    }
}

public class JuiceTest {
    public static void washDishes(List<? extends BottleOfWater> river){
        for (BottleOfWater d: river) {
            d.fill();
        }
    }

    public static <T extends BottleOfWater> int getSummaLiters(T[] waters){
        int summa = 0;
        for (T water : waters) {
            summa += water.getLitr();
        }
        return summa;
    }

    public static void main(String[] args) {
        List<BottleOfWater> river = new ArrayList<>();
        river.add(new BottleOfWater(1));
        //dishes.add(new Plate());
        washDishes(river);

        List<BottleOfJuice> juices = new ArrayList<>();
        juices.add(new BottleOfJuice(5));
        washDishes(juices);

        BottleOfJuice[] bottleOfJuices = {new BottleOfJuice(5),
                new BottleOfJuice(10), new BottleOfJuice(7)
        };

        System.out.println("Объем всех бутылок = " +
                getSummaLiters(bottleOfJuices));


    }
}
