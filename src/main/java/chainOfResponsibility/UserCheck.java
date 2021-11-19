package chainOfResponsibility;

import systemClasses.SystemManager;

/**
 * Элемент цепи, проверяющий существование пользователя в сети
 *
 * @see BaseCheck
 */
public class UserCheck extends BaseCheck {

    /**
     * Класс системного менеджера
     */
    private final SystemManager systemManager;

    public UserCheck(SystemManager systemManager) {
        this.systemManager = systemManager;
    }

    @Override
    public boolean check(String FIO) {
        if (systemManager.findUsersByFIO(FIO).size() == 0) {
            System.out.println("User not found");
            return false;
        }
        return checkNext(FIO);
    }
}

