package java8.interfaceChanges;

public class Car implements Vehicle {

    @Override
    public void drive() {
        System.out.println("drive car");
    }

    @Override
    public void clean() {
        System.out.println("clean car");
    }
}
