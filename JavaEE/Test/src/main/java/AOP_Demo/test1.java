package AOP_Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin on 2016-10-22.
 */
public class test1 {
    public static void main(String[] args) {
        ApplicationContext ct = new ClassPathXmlApplicationContext("test1.xml");

        Sleepable sleeper = (Sleepable)ct.getBean("linaProxy");

        sleeper.sleep();
    }
}
