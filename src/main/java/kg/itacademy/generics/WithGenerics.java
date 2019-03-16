package kg.itacademy.generics;

class WithGenerics<T> {
    private T val;
    public WithGenerics(T arg) { val = arg;}
    public String toString(){return "(" + val + ")";}
    public T getValue() {return val;}

    public static void main(String[] args) {
        WithGenerics<String> withGenerics1 =
                new WithGenerics<String>("Ha");
        WithGenerics<Integer> withGenerics2 =
                new WithGenerics<Integer>(1);
        withGenerics1 = new WithGenerics<>("asdads");
        //withGenerics2 = new WithGenerics<>("asdads");

        //Integer i = withGenerics1.getValue();

    }
}
