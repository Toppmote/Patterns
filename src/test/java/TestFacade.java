import facade.SystemFacade;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import systemClasses.FilterResult;
import systemClasses.Message;
import systemClasses.SystemManager;
import systemClasses.User;
import systemClasses.algorithms.FirstAlgorithm;
import systemClasses.filters.FilterObj;
import systemClasses.messageContent.Text;

import java.util.Arrays;
import java.util.Collections;

public class TestFacade {

    private static SystemManager systemManager;
    private static User user1, user2, user3;

    /**
     * Инициализируем системного менеджера пользователями и фильтром, у которого есть некоторые результаты фильтрации
     */
    @BeforeAll
    static void initData() {
        user1 = new User("User1", "01.01.2021");
        user2 = new User("User2", "02.03.2021");
        user3 = new User("User3", "03.03.2021");
        Message message1 = new Message(user1, Arrays.asList(user2, user3), new Text("Hello, users!"));
        Message message2 = new Message(user2, Collections.singletonList(user3), new Text("Hello, user3!"));
        systemManager = new SystemManager();
        systemManager.addUser(user1);
        systemManager.addUser(user2);
        systemManager.addUser(user3);
        FilterResult result1 = new FilterResult(user1, message1, 5);
        FilterResult result2 = new FilterResult(user2, message2, 2);
        FilterObj filter = new FilterObj(new FirstAlgorithm());
        filter.addFilterResult(result1);
        filter.addFilterResult(result2);
        systemManager.setFilter(filter);
    }

    @Test
    void testFacade() {
        System.out.println("-----------FACADE TEST-----------");
        SystemFacade facade = new SystemFacade(systemManager);
        facade.findUsersByFIO("User2");
        facade.findUsersByFIO("User0");
        facade.findFilterResultsByUserID(user1.getId());
        facade.findFilterResultsByUserID(user2.getId());
        facade.findFilterResultsByUserID(user3.getId());
        System.out.println("---------------------------------");
    }

}
