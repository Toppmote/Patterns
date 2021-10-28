package systemClasses.userActions;

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

    public SendMesAction(String description, String date, User... recipientList) {
        super(description, date);
        this.recipientList = Arrays.stream(recipientList).collect(Collectors.toList());
    }

    @Override
    public void doAction(User user) {

    }

}
