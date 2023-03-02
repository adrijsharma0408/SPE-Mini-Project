import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public static double squareRoot(double value1)
    {
        double ans = Math.sqrt(value1);
        logger.info("SQUARE ROOT " + "Input:"+value1 + " - " + ans);
        return ans;
    }
}
