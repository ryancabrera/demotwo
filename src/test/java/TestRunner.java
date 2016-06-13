import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by Ryan Cabrera on 6/12/2016.
 *
 * A class to run the unit tests from
 * tutorialspoint
 */
public class TestRunner {
    public static void main(String[] args){
        Result result = JUnitCore.runClasses(MessageUtilTest.class);
        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
