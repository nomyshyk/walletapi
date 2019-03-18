package kg.itacademy.lambda;

interface Countable{
    double func(double a, double b);
}

public class Matem {
    static double variableA = 0;
    public static void main(String[] args) {

        //double localA = 0;

        Countable cPlus = (a, b) ->  {
             double c = 0;
            //variableA = a;
            return a + b + c;
        } ;
        System.out.println(cPlus.func(90, 972));

        Countable cPow = (a, b) ->  Math.pow(a, b) ;
        System.out.println(cPow.func(2,5));

        Countable cMult = (a, b) -> a*b;
        System.out.println(cMult.func(9, 10));

    }
}
