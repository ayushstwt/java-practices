package java8.lambdaExpression;

interface MyInterfaceOne {
    void m1();
}

public class MyAppOne implements MyInterfaceOne {

    @Override
    public void m1() {
        System.out.println("m1 method called!");
    }

    public static void main(String[] args) {
        MyAppOne myAppOne = new MyAppOne();
        myAppOne.m1();
    }
}
