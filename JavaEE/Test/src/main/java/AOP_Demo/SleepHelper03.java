package AOP_Demo;

import org.aopalliance.aop.Advice;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
//import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.aop.TargetSource;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;

/**
 * Created by admin on 2016-10-22.
 */
@Aspect
@Component
public class SleepHelper03 {

    private long start=0;


    @Before("execution(* *.sleep(..))")
    public void beforeSleep(JoinPoint joinPoint){
        System.out.println("getSourceLocation:"+joinPoint.getSourceLocation());
        System.out.println("getKind"+joinPoint.getKind());
        System.out.println("getStaticPart"+joinPoint.getStaticPart());
        System.out.println("getTarget"+joinPoint.getTarget());


        System.out.println(joinPoint.getSignature().getName());
        start=System.currentTimeMillis();
    }

    @AfterReturning("execution(* *.sleep(..))")
    public void afterSleep(){
        long end=System.currentTimeMillis();

        System.out.println("睡觉后要做美梦");
        System.out.println(end-start);
    }


}
