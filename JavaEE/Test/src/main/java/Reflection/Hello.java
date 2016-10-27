package Reflection;

import java.io.Serializable;

/**
 * Created by admin on 2016-10-27.
 */
public class Hello extends Hi implements Cloneable,Serializable,he{
    private String content;
    private int counts;

    public String publicField;

    protected String protectedField;

    String defaultField;

    Hello(){ }

    Hello(String content,int counts){
        this.content=content;
        this.counts=counts;
    }

    public void sayHello(String s,int k){

        System.out.println(content);
    }

    public void myException() throws Exception {
        throw new  Exception();
    }

    public String toString(){
        return "content:"+this.content+",counts:"+this.counts;
    }
}


class Hi{

    public String HiPublicField;
    
    private String HiPrivateField;
}

interface he{
     public  static final String heField1="1" ;
     String heField2="2" ;
}