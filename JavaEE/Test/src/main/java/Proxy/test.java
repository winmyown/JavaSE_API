package Proxy;



import javax.security.auth.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by admin on 2016-10-24.
 */
public class test {
    public static void main(String[] args) {
//        InvocationHandler handler=new InvocationHandlerImpl(car);
//        Proxy.newProxyInstance();

        Subject realSubject=new RealSubject();

        realSubject.rent();
        realSubject.hello("world");
        System.out.println("---------------------------------------------------");

        InvocationHandler handler=new DynamicProxy(realSubject);

        Subject subject= (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(),
                realSubject.getClass().getInterfaces(),handler);

        System.out.println(subject.getClass().getName());

        System.out.println("------------------------------------------------------");
        subject.rent();
        subject.hello("world");

    }
}
