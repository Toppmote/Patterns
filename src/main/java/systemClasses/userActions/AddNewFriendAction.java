package systemClasses.userActions;

import bridge.Framework;
import systemClasses.User;

/**
 * Класс, описывающий метод добавления нового друга
 */
public class AddNewFriendAction extends UserAction {

    public AddNewFriendAction(String date, Framework framework) {
        super(date, framework);
    }

    @Override
    public void doAction(User user) {
        framework.operation();
        System.out.println("New friend has been added. Date " + date);
    }

}
