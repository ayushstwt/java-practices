package java8.lambdaExpression;

@FunctionalInterface
public interface MyInterface {
    void show();
}


//Invalid ---->CTE
//@FunctionalInterface
//interface MyInterfaceNew {
//    void show();
//    void run();
//}


//valid
//@FunctionalInterface
//interface parentInterface {
//    void show();
//}
//
//@FunctionalInterface
//interface childInterface extends parentInterface {
//
//}

//Invalid ---->CTE
//@FunctionalInterface
//interface parentInterface {
//    void show();
//}
//
//@FunctionalInterface
//interface childInterface extends parentInterface {
//  void run();
//}

