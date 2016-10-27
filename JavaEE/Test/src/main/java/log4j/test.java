package log4j;

import org.apache.log4j.Logger;

/**
 * Created by admin on 2016-10-21.
 */
public class test {
    private static Logger logger=Logger.getLogger(test.class);

    public static void main(String[] args) {
        logger.debug("this is debugger message");
        logger.info("this is info message");
        logger.error("this is error message");
    }
}
