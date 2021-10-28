package delegate;

import org.junit.jupiter.api.Test;
import systemClasses.User;
import systemClasses.userActions.AddNewFriendAction;
import systemClasses.userActions.DoNewPostAction;
import systemClasses.userActions.SendMesAction;

public class TestDelegate {

    @Test
    void testDelegate() {
        System.out.println("-----------DELEGATE TEST-----------");
        User user = new User("User", "01.01.2021");
        ActionDelegate actionDelegate = new ActionDelegate(new AddNewFriendAction("29.10.2021"));
        actionDelegate.doAction(user);

        actionDelegate.setAction(new DoNewPostAction("29.10.2021"));
        actionDelegate.doAction(user);

        actionDelegate.setAction(new SendMesAction("29.10.2021"));
        actionDelegate.doAction(user);
        System.out.println("-----------------------------------");
    }

}
