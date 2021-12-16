import observer.Group;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import strategy.SpamAlgorithm;
import systemClasses.SystemManager;
import systemClasses.User;
import systemClasses.filters.FilterObj;

public class TestObserver {

    private static SystemManager systemManager;
    private static User user1, user2, user3;

    /**
     * Инициализируем системного менеджера пользователями и фильтром
     */
    @BeforeAll
    static void initData() {
        user1 = new User("User1", "01.01.2021");
        user2 = new User("User2", "02.03.2021");
        user3 = new User("User3", "03.03.2021");
        FilterObj filter = new FilterObj(new SpamAlgorithm());
        systemManager = new SystemManager();
        systemManager.addUser(user1);
        systemManager.addUser(user2);
        systemManager.addUser(user3);
        systemManager.setFilter(filter);
    }

    @Test
    void testObserver() {
        Group carsLovers = systemManager.createGroup("Cars lovers");
        carsLovers.subscribe(user1);
        carsLovers.subscribe(user2);
        carsLovers.subscribe(user3);
        carsLovers.addNewPost("We love cars!");
    }

}
