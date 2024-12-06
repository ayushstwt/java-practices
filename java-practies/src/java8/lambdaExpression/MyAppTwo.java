package java8.lambdaExpression;

@FunctionalInterface
interface MyInterfaceTwo {
    void m2();
}

public class MyAppTwo {
    public static void main(String[] args) {
       MyInterfaceTwo myInterfaceTwo  =() -> System.out.println("m2 method is called!");
       myInterfaceTwo.m2();
    }
}
