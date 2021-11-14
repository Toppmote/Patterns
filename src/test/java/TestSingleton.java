import facade.SystemFacade;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import systemClasses.FilterResult;
import systemClasses.Message;
import systemClasses.SystemManager;
import systemClasses.User;
import strategy.SpamAlgorithm;
import systemClasses.filters.FilterObj;
import systemClasses.messageContent.Text;

import java.util.Arrays;
import java.util.Collections;

public class TestSingleton {

    private static SystemManager systemManager;

    /**
     * Инициализируем системного менеджера пользователями и фильтром, у которого есть некоторые результаты фильтрации
     */
    @BeforeAll
    static void initData() {
        User user1 = new User("User1", "01.01.2021");
        User user2 = new User("User2", "02.03.2021");
        User user3 = new User("User3", "03.03.2021");
        Message message1 = new Message(user1, Arrays.asList(user2, user3), new Text("Hello, users!"));
        Message message2 = new Message(user2, Collections.singletonList(user3), new Text("Hello, user3!"));
        systemManager = new SystemManager();
        systemManager.addUser(user1);
        systemManager.addUser(user2);
        systemManager.addUser(user3);
        FilterResult result1 = new FilterResult(user1, message1, 5);
        FilterResult result2 = new FilterResult(user2, message2, 2);
        FilterObj filter = new FilterObj(new SpamAlgorithm());
        filter.addFilterResult(result1);
        filter.addFilterResult(result2);
        systemManager.setFilter(filter);
    }

    @Test
    void testSingleton () {
        System.out.println("-----------SINGLETON TEST-----------");
        SystemFacade facade = SystemFacade.getInstance(systemManager);
        SystemFacade anotherFacade = SystemFacade.getInstance(systemManager);
        if (facade == anotherFacade)
            System.out.println("Facade objects are the same!");
        else
            System.out.println("Facade objects are different");
        System.out.println("------------------------------------");
    }

}
