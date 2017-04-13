package infopkg;

/**
 * <a href="0919starttowork@gmail.com">Nathanael Yang</a> 4/13/2017 6:29 AM
 */

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

public class Message {
    private static final Logger logger = LoggerFactory.getLogger(Message.class);

    public static void main(String[] args) {


        String msg = "Hello World!";

        logger.info("The message is: {}", msg);


    }

}
