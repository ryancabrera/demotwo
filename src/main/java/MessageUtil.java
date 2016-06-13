/**
 * Created by Ryan Cabrera on 6/12/2016.
 *
 * Sample class example from tutorialspoint
 * regarding how to use JUnit Test
 */
public class MessageUtil {
    private String message;

    //A constructor
    public MessageUtil(String message){
        this.message = message;
    }

    public String printMessage(){
        System.out.println(message);
        return message;
    }
}
