package delegate;

import lombok.Setter;
import systemClasses.User;
import systemClasses.userActions.Action;

/**
 * Класс-делегат для действий пользователя
 */
public class ActionDelegate implements Action {

    private Action action;

    public ActionDelegate(Action action) {
        this.action = action;
    }

    @Override
    public void doAction(User user) {
        action.doAction(user);
    }

    public void setAction(Action action) {
        this.action = action;
    }
}
