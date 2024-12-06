package java8.lambdaExpression;

import java.util.function.Predicate;

//Task-2 : Take list of persons and print persons whose age is >= 18 using Lambda Expression
public class PracticeQuestion2 {
    public static void main(String[] args) {
        Person p1 = new Person("Ayush", 20);
        Person p2 = new Person("Abhay", 16);
        Person p3 = new Person("Sachin", 19);
        Person p4 = new Person("Shubham", 17);
        Person p5 = new Person("Rahul", 18);
        Person[] persons = {p1, p2, p3, p4, p5};
        Predicate<Integer> p= i->i>18;
        for (Person person : persons) {
            if(p.test(person.age)){
                System.out.println(person.name+" "+person.age);
            }
        }
    }
}

class Person
{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
}