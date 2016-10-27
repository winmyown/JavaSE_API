package Object;

/**
 * Created by admin on 2016-10-25.
 */
public class Person implements Cloneable {
    private Name name;
    private int age;

//    private Object clone(){
//        return name;
//        Object a=new Object();
//        a.equals("");
//        "".equals("");
//    }
public static void main(String[] args) throws ClassNotFoundException {
    Number n = 0;
    Class<? extends Number> c = n.getClass();
    System.out.println("".getClass());
    System.out.println(c.toString());
    System.out.println(Class.forName("Object.Person"));
}
}
