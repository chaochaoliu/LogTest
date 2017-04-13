package debugpkg;

/**
 * <a href="0919starttowork@gmail.com">Nathanael Yang</a> 4/13/2017 6:39 AM
 */
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

public class App {
    private final Logger logger = LoggerFactory.getLogger(App.class);


    public static void main(String[] args) {

        App obj = new App();
        obj.start();

    }

    private void start() {

        logger.error("Starting debugging");

        logger.debug("Ending debugging");
    }
}
