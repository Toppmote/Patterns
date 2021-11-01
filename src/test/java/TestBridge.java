import bridge.Framework;
import bridge.Hibernate;
import bridge.Lombok;
import org.junit.jupiter.api.Test;
import systemClasses.User;
import systemClasses.userActions.AddNewFriendAction;
import systemClasses.userActions.DoNewPostAction;
import systemClasses.userActions.UserAction;

public class TestBridge {

    @Test
    void testBridge() {
        System.out.println("-----------BRIDGE TEST-----------");
        testFramework(new Hibernate());
        testFramework(new Lombok());
        System.out.println("---------------------------------");
    }

    void testFramework(Framework framework) {
        System.out.println("\nAdd new friend action:");
        User user = new User("user", "02.11.2021");
        UserAction action = new AddNewFriendAction("02.11.2021", framework);
        action.doAction(user);
        System.out.println("\nDo new post action");
        action = new DoNewPostAction("02.11.2021", framework);
        action.doAction(user);
    }


}
