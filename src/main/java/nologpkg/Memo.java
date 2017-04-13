package nologpkg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <a href="0919starttowork@gmail.com">Kevin</a> 4/13/2017 6:29 AM
 */
public class Memo {
    private static final Logger logger = LoggerFactory.getLogger(Memo.class);

    public static void main(String[] args) {


        logger.debug("The message should not be recorded in log files.");


    }
}
