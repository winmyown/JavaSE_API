package slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * Created by admin on 2016-10-21.
 */
public class helloworld {
    private final static Logger log1 = LoggerFactory.getLogger(helloworld.class);

    public static void main(String[] args) {
        try {
            log1.error("this is an error test.");
            log1.debug("{} is {}.",new Object[]{"a","b"});
            System.out.println("OK.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
