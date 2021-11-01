package systemClasses.userActions;

import bridge.Framework;
import systemClasses.User;

/**
 * Абстрактный класс, описывающий действия пользователей
 */
public abstract class UserAction implements Action {

    /**
     * Дата совершения действия
     */
    public final String date;

    /**
     * Фреймворк, который выполняется при выполнении действий
     */
    public Framework framework;

    public UserAction(String date, Framework framework) {
        this.date = date;
        this.framework = framework;
    }

    /**
     * Метод совершения действия
     * @param user пользователь, совершивший действие
     */
    public abstract void doAction(User user);

    public String getDate() {
        return date;
    }

    public void setFramework(Framework framework) {
        this.framework = framework;
    }
}
