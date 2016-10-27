package AOP_static_waver;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by admin on 2016-10-24.
 */
public class SimpleAdvise implements MethodInterceptor {

    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("before");
        Object retVal=invocation.proceed();
        System.out.println("after");
        return retVal;
    }

}