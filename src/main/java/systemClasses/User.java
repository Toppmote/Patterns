package systemClasses;

import lombok.Getter;
import lombok.Setter;
import systemClasses.userActions.UserAction;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, описывающий пользователя социальной сети
 */
@Getter
public class User {

    /**
     * ФИО пользователя
     */
    @Setter
    public String FIO;

    /**
     * Дата регистрации
     */
    private final String regDate;

    /**
     * Список друзей
     */
    public final List<User> friendsList;

    /**
     * Лента активности
     */
    private final List<UserAction> activityFeed;

    /**
     * Список сообщений
     */
    private final List<Message> messageList;

    public User(String FIO, String regDate) {
        this.FIO = FIO;
        this.regDate = regDate;
        friendsList = new ArrayList<>();
        activityFeed = new ArrayList<>();
        messageList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "User{" +
                "FIO='" + FIO + '\'' +
                ", regDate='" + regDate + '\'' +
                '}';
    }
}
