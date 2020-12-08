package performance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogExample {

    Logger logger = LoggerFactory.getLogger(LogExample.class);

    Integer t;
    Integer oldT;

    public void setTemperature(Integer temperature) {
        oldT = t;
        t = temperature;

        logger.debug("Temperature set to {}. Old temperature was {}.", t, oldT);

        if (temperature > 50) {
            logger.info("Temperature has risen above 50 degrees.");
        }
    }

    public void doSomething() {
        logger.info("Hello World");
    }

    public static void main(String[] args) {
        var logExample = new LogExample();
        logExample.doSomething();
        logExample.setTemperature(32);
        logExample.setTemperature(14);
        logExample.setTemperature(51);
    }
}
