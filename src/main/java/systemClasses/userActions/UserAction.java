package systemClasses.userActions;

import lombok.Getter;
import systemClasses.User;

/**
 * Абстрактный класс, описывающий действия пользователей
 */
public abstract class UserAction {

    /**
     * Дата совершения действия
     */
    @Getter
    public final String date;

    public UserAction(String date) {
        this.date = date;
    }

    /**
     * Метод совершения действия
     * @param user пользователь, совершивший действие
     */
    public abstract void doAction(User user);

}
