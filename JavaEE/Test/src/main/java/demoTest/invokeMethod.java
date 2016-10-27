package demoTest;

/**
 * Created by admin on 2016-10-19.
 */
public class invokeMethod {
    public static void main(String[] args) {
        invokeMethod invokeMethod=new invokeMethod();
        invokeMethod.invoke();
    }

    public void invoke(){
        String s1= method1();
        System.out.println(s1);
        String s2= this.method1();
        System.out.println(s2);

    }

    public String method1(){
        return this.toString()+"-------s1";
    }
}
