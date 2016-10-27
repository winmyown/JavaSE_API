package AOP_static_waver;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

/**
 * Created by admin on 2016-10-24.
 */
public class test {
    public static void main(String[] args) {
        BeanOne one=new BeanOne();
        BeanTwo two=new BeanTwo();
        BeanOne proxyOne;
        BeanTwo proxyTwo;

        Pointcut pc=new SimpleStaticPointcut();
        Advice advice=new SimpleAdvise();
        Advisor advisor=new DefaultPointcutAdvisor(pc,advice);


        //创建BeanOne代理
        ProxyFactory pf1=new ProxyFactory();
        pf1.addAdvisor(advisor);
        pf1.setTarget(one);
        proxyOne=(BeanOne)pf1.getProxy();

        //创建BeanTwo代理
        ProxyFactory pf2=new ProxyFactory();
        pf2.addAdvisor(advisor);
        pf2.setTarget(two);
        proxyTwo=(BeanTwo)pf2.getProxy();


        proxyOne.foo();
        proxyOne.bar();

        proxyTwo.foo();
        proxyTwo.bar();
    }
}
