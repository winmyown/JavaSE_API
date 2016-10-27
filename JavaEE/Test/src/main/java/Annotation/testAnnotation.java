package Annotation;

import java.lang.annotation.*;

/**
 * Created by admin on 2016-10-15.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface testAnnotation {
    String value() default "0";
}
