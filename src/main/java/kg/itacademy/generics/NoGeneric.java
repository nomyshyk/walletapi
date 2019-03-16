package kg.itacademy.generics;

public class NoGeneric {
    Object val;

    public NoGeneric(Object val) {
        this.val = val;
    }

    public Object getVal() {
        return val;
    }

    public void setVal(Object val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "NoGeneric{" +
                "val=" + val +
                '}';
    }

    public static void main(String[] args) {
        NoGeneric ngI = new NoGeneric(1);
        NoGeneric ngS = new NoGeneric("9");
        Integer iN = (Integer) ngI.getVal();
        if(ngS.getVal() instanceof Integer){
            System.out.println("Это реально интежер");
            Integer iS = (Integer) ngS.getVal();
        }


        System.out.println(iN );


    }
}
