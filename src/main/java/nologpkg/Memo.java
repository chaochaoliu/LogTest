package nologpkg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <a href="mailto:nathanael4ever@gmail.com">Nathanael Yang</a> 4/13/2017 7:36 AM
 */
public class Memo {
    private static final Logger logger = LoggerFactory.getLogger(Memo.class);

    public static void main(String[] args) {


        logger.debug("The message should not be recorded in log files.");


    }
}
