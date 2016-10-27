package OOP;

/**
 * Created by admin on 2016-10-27.
 */
public class extendTest {
    public static void main(String[] args) {
        System.out.println("hello");

//        Person person=new Student();
    }
}

class Person {
    String name;
    int age;

    Person() {
        System.out.println("Person的构造器！");
    }
}

class Student extends Person {

    Student(String s){
//        super(s);
        String a="";

        System.out.println("student");
    }

}