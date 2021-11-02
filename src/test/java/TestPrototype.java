import org.junit.jupiter.api.Test;
import systemClasses.Message;
import systemClasses.User;
import systemClasses.messageContent.Text;

import java.util.Arrays;
import java.util.List;

public class TestPrototype {

    @Test
    void testPrototype() {
        System.out.println("------------PROTOTYPE TEST-----------");
        User user1 = new User("User1", "01.01.2021");
        User user2 = new User("User2", "02.03.2021");
        User user3 = new User("User3", "03.03.2021");
        Message message = new Message(user1, Arrays.asList(user2, user3), new Text("Hello, users!"));

        Message clone = (Message) message.clone();
        boolean equalsFlag = true;
        if (message != clone) {
            System.out.println("Messages are different");
            if (message.getSender().equals(clone.getSender())) {
                for (int i = 0; i < message.getRecipientList().size(); i++)
                    if (!message.getRecipientList().get(i).equals(clone.getRecipientList().get(i))) {
                        equalsFlag = false;
                        System.out.println("The content of the messages is different");
                        break;
                    }
                if (equalsFlag) {
                    for (int i = 0; i < message.getMessageContent().size(); i++)
                        if (!message.getMessageContent().get(i).equals(clone.getMessageContent().get(i))) {
                            equalsFlag = false;
                            System.out.println("The content of the messages is different");
                            break;
                        }
                    if (equalsFlag)
                        System.out.println("The content of the messages is the same");
                }
            } else
                System.out.println("The content of the messages is different");
        } else
            System.out.println("Messages are identical");
        System.out.println("-------------------------------------");
    }

}
