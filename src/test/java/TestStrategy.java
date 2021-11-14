import builder.MessageDirector;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import strategy.ActionAlgorithm;
import strategy.SpamAlgorithm;
import strategy.TextAlgorithm;
import systemClasses.Message;
import systemClasses.User;
import systemClasses.filters.FilterObj;
import systemClasses.messageContent.Text;

import java.util.Collections;

public class TestStrategy {

    static User user1;
    static Message message;

    @BeforeAll
    static void initData() {
        user1 = new User("User1", "14.11.2021");
        message = Message.builder().sender(user1)
                .contentList(Collections.singletonList(new Text("Hello")))
                .build();
    }

    @Test
    void testStrategy() {
        System.out.println("-----------STRATEGY TEST-----------");
        FilterObj filter = new FilterObj(new TextAlgorithm());
        System.out.println();
        filter.computeResult(user1, message);
        System.out.println();
        filter.setAlgorithm(new SpamAlgorithm());
        filter.computeResult(user1, message);
        System.out.println();
        filter.setAlgorithm(new ActionAlgorithm());
        filter.computeResult(user1, message);
        System.out.println("-----------------------------------");
    }

}
