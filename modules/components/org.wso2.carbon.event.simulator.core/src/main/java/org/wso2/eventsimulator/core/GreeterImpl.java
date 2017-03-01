package org.wso2.eventsimulator.core;

/**
 * Created by ruwini on 2/13/17.
 */
import java.util.logging.Logger;

/**
 * This class implements the Greeter interface
 * @since 1.0.0
 * */

public class GreeterImpl implements Greeter {
    Logger logger = Logger.getLogger(GreeterImpl.class.getName());

    private String name;

    public GreeterImpl(String name) {
        this.name = name ;
    }

    /**
     * Output an info log saying Hello.
     */

    public void hello() {
        logger.info("Hello " + name );
    }

    /**
     * Output an info log saying Bye.
     */

    public void bye() {
        logger.info("Bye " + name);
    }
}
