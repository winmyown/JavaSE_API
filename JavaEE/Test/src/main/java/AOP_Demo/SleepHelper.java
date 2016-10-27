package AOP_Demo;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by admin on 2016-10-22.
 */
public class SleepHelper implements MethodBeforeAdvice, AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method,
                               Object[] args, Object target) throws Throwable {
        System.out.println("睡觉前要敷面膜");
    }

    @Override
    public void before(Method method, Object[] args, Object target)
            throws Throwable {
        System.out.println("睡觉后要做美梦");
    }

}
