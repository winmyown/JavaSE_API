package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by admin on 2016-10-24.
 */
public class DynamicProxy implements InvocationHandler {

    private Object subject;


    public DynamicProxy(Object subject){
        this.subject=subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //　　在代理真实对象前我们可以添加一些自己的操作
//        System.out.println("before rent house");

//        System.out.println("Method:" + method);

        String method1 = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(method1);
        System.out.println(method);

        method.invoke(subject,args);

//        System.out.println("after rent house");

        return null;
    }
}
