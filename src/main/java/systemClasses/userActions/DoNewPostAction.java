package systemClasses.userActions;

import bridge.Framework;
import systemClasses.User;

/**
 * Класс, описывающий метод добавления новой записи
 */
public class DoNewPostAction extends UserAction {

    public DoNewPostAction(String date, Framework framework) {
        super(date, framework);
    }

    @Override
    public void doAction(User user) {
        framework.operation();
        System.out.println("New post has been posted. Date " + date);
    }

}
