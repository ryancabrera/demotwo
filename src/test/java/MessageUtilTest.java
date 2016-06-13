import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Ryan Cabrera on 6/12/2016.
 *
 * The code from the unit test example
 * from tutorialspoint
 */
public class MessageUtilTest {
    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage(){
        assertEquals(message, messageUtil.printMessage());
    }

}