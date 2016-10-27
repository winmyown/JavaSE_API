package AOP_static_waver;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

/**
 * Created by admin on 2016-10-24.
 */
public class SimpleStaticPointcut extends StaticMethodMatcherPointcut {

    public boolean matches(Method method, Class cls) {

        return ("foo".equals(method.getName()));
    }


    public ClassFilter getClassFilter() {

        return new ClassFilter(){
            public boolean matches(Class cls){
                return (cls==BeanOne.class);
            }
        };
    }

}