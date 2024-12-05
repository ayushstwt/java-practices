package java8.interfaceChanges;

public interface Vehicle {

    //abstract method
    void drive();

    //concrete method
    default void clean()
    {
        System.out.println("clean vehicle");
    }
    static void wash()
    {
        System.out.println("wash vehicle");
    }

}
