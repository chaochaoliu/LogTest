package errorpkg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * <a href="mailto:nathanael4ever@gmail.com">Nathanael Yang</a> 4/13/2017 7:26 AM
 */
public class Note {
    private static final Logger logger = LoggerFactory.getLogger(Note.class);

    public static void main(String[] args) {

        MDC.put("logFileName", "head1");

        logger.info("error began");

        logger.error("error ended");

        MDC.remove("logFileName");

    }
}


