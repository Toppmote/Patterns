package chainOfResponsibility;

import state.BlockedState;
import systemClasses.SystemManager;
import systemClasses.User;

/**
 * Элемент цепи, проверяющий статус пользователя в сети
 *
 * @see BaseCheck
 */
public class UserStatusCheck extends BaseCheck {

    private final SystemManager systemManager;

    public UserStatusCheck(SystemManager systemManager) {
        this.systemManager = systemManager;
    }

    @Override
    public boolean check(String FIO) {
        User user = systemManager.findUsersByFIO(FIO).get(0);
        if (user.getState() instanceof BlockedState) {
            System.out.println("You are blocked and cannot use our social network");
            return false;
        }
        return checkNext(FIO);
    }
}
