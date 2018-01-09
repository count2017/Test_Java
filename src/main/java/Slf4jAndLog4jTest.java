import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2018-01-09.
 */
@NoArgsConstructor
public class Slf4jAndLog4jTest {
    private static Logger log = LoggerFactory.getLogger(Slf4jAndLog4jTest.class);
    public void log(){
        //使用slf4j的占位符功能
        //测试结果：15:39:50,506  INFO Slf4jAndLog4jTest:14 - my name is Bob
        log.info("my name is {}","Bob");
    }

    public static void main(String[] args) {
        Slf4jAndLog4jTest slt = new Slf4jAndLog4jTest();
        slt.log();
    }

}
