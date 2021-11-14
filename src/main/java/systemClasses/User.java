package systemClasses;

import lombok.Getter;
import lombok.Setter;
import state.UnverifiedState;
import state.UserState;
import systemClasses.userActions.UserAction;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, описывающий пользователя социальной сети
 */
public class User {

    /**
     * ID пользователя. Уникально
     */
    private final int id;

    /**
     * ФИО пользователя
     */
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

    /**
     * Состояние пользователя
     */
    private UserState state;

    public User(String FIO, String regDate) {
        this.FIO = FIO;
        this.regDate = regDate;
        friendsList = new ArrayList<>();
        activityFeed = new ArrayList<>();
        messageList = new ArrayList<>();
        this.id = this.hashCode();
        this.state = new UnverifiedState(this);
    }

    /**
     * Метод входа в соц. сеть
     */
    public void logIn() {
        this.state.onLoggingIn();
    }

    @Override
    public String toString() {
        return "User{" +
                "FIO='" + FIO + '\'' +
                ", regDate='" + regDate + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public UserState getState() {
        return state;
    }

    public void setState(UserState state) {
        this.state = state;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }
}
