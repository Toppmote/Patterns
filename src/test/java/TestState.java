import org.junit.jupiter.api.Test;
import state.BlockedState;
import state.VerifiedState;
import systemClasses.User;

public class TestState {

    @Test
    void testState() {
        System.out.println("-----------STATE TEST-----------");
        User user = new User("User1", "14.11.2021");
        user.logIn();
        System.out.println();
        user.setState(new VerifiedState(user));
        user.logIn();
        System.out.println();
        user.setState(new BlockedState(user));
        user.logIn();
        System.out.println("--------------------------------");
    }

}
