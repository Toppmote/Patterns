import chainOfResponsibility.BaseCheck;
import chainOfResponsibility.TwoFactorAuthCheck;
import chainOfResponsibility.UserCheck;
import chainOfResponsibility.UserStatusCheck;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import systemClasses.SystemManager;
import systemClasses.User;


public class TestChainOfResponsibility {

    private static SystemManager systemManager;
    private static User user1;

    /**
     * Инициализируем системного менеджера пользователями
     */
    @BeforeAll
    static void initData() {
        user1 = new User("User1", "01.01.2021");
        systemManager = new SystemManager();
        systemManager.addUser(user1);
    }

    @Test
    void testChainOfResponsibility() {
        BaseCheck check = new UserCheck(systemManager);
        check.connectTo(new UserStatusCheck(systemManager))
                .connectTo(new TwoFactorAuthCheck());
        systemManager.setChainCheck(check);
        systemManager.logIn(user1.FIO);
        System.out.println();

        user1.doBadPost();
        systemManager.logIn(user1.FIO);
        System.out.println();

        systemManager.logIn("Not user1");
    }

}
