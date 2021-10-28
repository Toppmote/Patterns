package systemClasses.userActions;

import lombok.Getter;
import systemClasses.User;

/**
 * Абстрактный класс, описывающий действия пользователей
 */
public abstract class UserAction {

    /**
     * Описание действия
     */
    @Getter
    public final String description;

    /**
     * Дата совершения действия
     */
    @Getter
    public final String date;

    public UserAction(String description, String date) {
        this.description = description;
        this.date = date;
    }

    /**
     * Метод совершения действия
     * @param user пользователь, совершивший действие
     */
    public abstract void doAction(User user);

}
