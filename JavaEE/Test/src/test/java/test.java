import java.util.List;
import java.util.Observable;

/**
 * Created by admin on 2016-10-24.
 */
public class test {
    public static void main(String[] args) {
        String packageName="AOP_Demo";
        List clazzs=ClassUtil.getClasses(packageName);
        for (Object one:clazzs){
            System.out.println(one.toString());
        }
    }
}
