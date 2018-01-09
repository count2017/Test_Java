
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by lenovo on 2018-01-09.
 */
public class JCLTest {
    private static Log log = LogFactory.getLog(JCLTest.class);
    public void log(){
       log.debug("Debug info");
        log.info("Info info");
        log.warn("Warn info");
        log.error("Error info");
        log.fatal("Fatal info");
    }

    public static void main(String[] args) {
        JCLTest j = new JCLTest();
        j.log();
    }

}
