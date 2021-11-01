package systemClasses.userActions;

import bridge.Framework;
import lombok.Getter;
import systemClasses.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Класс, описывающий метод отправки сообщения
 */
public class SendMesAction extends UserAction {

    /**
     * Список пользователей, которым было отправлено сообщение
     */
    @Getter
    public List<User> recipientList;

    public SendMesAction(String date, Framework framework, User... recipientList) {
        super(date, framework);
        this.recipientList = Arrays.stream(recipientList).collect(Collectors.toList());
    }

    @Override
    public void doAction(User user) {
        framework.operation();
        System.out.println("New message has been sent. Date " + date);
    }

}
