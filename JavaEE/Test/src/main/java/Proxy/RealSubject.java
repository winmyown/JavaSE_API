package Proxy;



/**
 * Created by admin on 2016-10-24.
 */
public class RealSubject implements Subject{
    @Override
    public void rent() {
        System.out.println("I want to rent my house");
    }

    @Override
    public void hello(String str) {
        System.out.println("hello: " + str);
    }


}
