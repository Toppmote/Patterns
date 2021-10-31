import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import proxy.ProxyFilter;
import systemClasses.Message;
import systemClasses.User;
import systemClasses.algorithms.FirstAlgorithm;
import systemClasses.filters.FilterObj;
import systemClasses.messageContent.Text;

import java.util.Arrays;
import java.util.List;

public class TestProxy {

    private static User user1, user2, user3;

    @BeforeAll
    static void initUsers() {
        user1 = new User("User1", "01.01.2021");
        user2 = new User("User2", "02.03.2021");
        user3 = new User("User3", "03.03.2021");
    }

    @Test
    void testProxy() {
        System.out.println("-----------PROXY TEST-----------");
        FilterObj mainFilter = new FilterObj(new FirstAlgorithm());
        ProxyFilter proxyFilter = new ProxyFilter(mainFilter);
        List<User> userList = Arrays.asList(user2, user3);
        proxyFilter.computeResult(user1, new Message(user1, userList, new Text("Some text")));
        System.out.println("--------------------------------");
    }

}
