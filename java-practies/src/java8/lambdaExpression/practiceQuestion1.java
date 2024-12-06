package java8.lambdaExpression;

import java.util.function.Predicate;
//Task: Declare names in an array and print names which are starting with 'A' using lambda expression.
public class practiceQuestion1 {
    public static void main(String[] args) {
        String names[]={"Ayush", "Abhay", "Sachin", "Shubham", "Rahul"};
        Predicate<String> p= i->i.charAt(0)=='A';
        for (String name : names) {
            if(p.test(name)){
                System.out.println(name);
            }
        }
    }
}
