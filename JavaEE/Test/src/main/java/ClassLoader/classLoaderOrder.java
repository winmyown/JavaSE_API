package ClassLoader;

/**
 * Created by admin on 2016-10-15.
 */

/**
 *
 * 1、虚拟机在首次加载Java类时，会对静态成员变量、静态初始化块、静态方法进行一次初始化
 2、只有在调用new方法时才会创建类的实例
 3、类实例创建过程：按照父子继承关系进行初始化，首先执行父类的初始化块部分，然后是父类的构造方法；再执行本类继承的子类的初始化块，最后是子类的构造方法
 4、类实例销毁时候，首先销毁子类部分，再销毁父类部分
 *
 */
public class classLoaderOrder {
    public static void main(String[] args) {
       //Parent.parentStaticMethod();
        Child child = new Child();
    }
}

class Parent
{
    public static int t = parentStaticMethod2();
    {
        System.out.println("父类非静态初始化块");
    }
    static
    {
        System.out.println("父类静态初始化块");
    }
    public Parent()
    {
        System.out.println("父类的构造方法");
    }
    public static int parentStaticMethod()
    {
        System.out.println("父类类的静态方法");
        return 10;
    }
    public static int parentStaticMethod2()
    {
        System.out.println("父类的静态方法2");
        return 9;
    }

    @Override
    protected void finalize() throws Throwable
    {
        // TODO Auto-generated method stub
        super.finalize();
        System.out.println("销毁父类");
    }

}

class Child extends Parent
{
    {
        System.out.println("子类非静态初始化块");
    }
    static
    {
        System.out.println("子类静态初始化块");
    }
    public Child()
    {
        System.out.println("子类的构造方法");
    }
    public static int childStaticMethod()
    {
        System.out.println("子类的静态方法");
        return 1000;
    }
    @Override
    protected void finalize() throws Throwable
    {
        // TODO Auto-generated method stub
        super.finalize();
        System.out.println("销毁子类");
    }
    public void hello(){
        System.out.println("hello");
    }

}
