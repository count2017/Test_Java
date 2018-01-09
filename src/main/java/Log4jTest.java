

import org.apache.log4j.Logger;
/**
 * Created by lenovo on 2018-01-09.
 */
public class Log4jTest {
    private static Logger log = Logger.getLogger(Log4jTest.class);
    public void log(){
        log.debug("Debug info");
        log.warn("Warn info");
        log.info("Info info");
        log.error("Error info");
        log.fatal("Fatal info");

    }

    public static void main(String[] args) {
        Log4jTest t = new Log4jTest();
        t.log();

    }
}
