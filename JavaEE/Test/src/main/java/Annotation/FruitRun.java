package Annotation;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 * Created by admin on 2016-10-15.
 */
public class FruitRun
{
    public static void main(String[] args) {
        //FruitInfoUtil.getFruitInfo(Apple.class);
        FruitInfoUtil.getFruitInfo(subApple.class);

//        subApple subApple=new subApple();
//        subApple.displayName();
    }
}
