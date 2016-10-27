package Reflection;

import org.springframework.beans.factory.xml.BeanDefinitionParser;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by admin on 2016-10-27.
 */
public class GetAllHelloInfo {
    public static void main(String[] args) {
        System.out.println("--------------------包名、类名（修饰符）、父类、接口-----------------------");

        Class hello=Hello.class;


        String className=hello.getName();

        int  modifyType=hello.getModifiers();

        String modifyName= Modifier.toString(modifyType);

        System.out.println("修饰符、实体名称："+modifyName+" "+className);

        Class[] interfaces=hello.getInterfaces();

        String interfacesName="";
        String sp="";
        for (Class interfaceName:interfaces){

            interfacesName=interfacesName+sp+interfaceName.getName();

            sp=",";
        }
        System.out.println("接口名称："+interfacesName);

        Class superClass=hello.getSuperclass();

        System.out.println("父类名称："+superClass.getName());

        System.out.println("--------------------字段(修饰符、权限)、方法（修饰符，返回值，参数，异常）、构造函数-----------------------");


        //获取本类声明的
        Field[] fields=hello.getDeclaredFields();

        System.out.println("本类声明的 ---------修饰符、类型、字段名：");

        for (Field field:fields){

            System.out.println(Modifier.toString(field.getModifiers())+" "+field.getType().getName()+" "+field.getName());

        }

        //获取父类或者接口的字段

        System.out.println("本类、父类或接口声明的public型 ---------修饰符、类型、字段名：");
        Field[] fields1=hello.getFields();

        for (Field field:fields1){

            System.out.println(Modifier.toString(field.getModifiers())+" "+field.getType().getName()+" "+field.getName());

        }



        System.out.println("--------------------、方法（修饰符，返回值，参数，异常）-----------------------");

        Method[] methods=hello.getDeclaredMethods();


        for (Method method:methods){

            Class[] paras=method.getParameterTypes();
            String parasString="";
            String pp="";
            for (int i=0;i<paras.length;i++){

                parasString=parasString+pp+paras[i].getSimpleName()+" arg"+i;
                pp=",";
            }

            Class<?>[] exceptions=method.getExceptionTypes();

            String exceptionsName="";
            if (exceptions.length>0){
                String ep="";
                for (Class exception:exceptions){
                    exceptionsName=exceptionsName+ep+exception.getName();
                    ep=",";
                }
            }

            System.out.println(Modifier.toString(method.getModifiers())+" "+method.getReturnType().getName()+" "+method.getName()+
            "("+parasString+")"+" throws "+exceptionsName);

        }


    }
}
