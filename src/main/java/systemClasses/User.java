package systemClasses;

import lombok.Getter;
import lombok.Setter;
import memento.Memento;
import memento.UserSnapshot;
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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("User{" + "FIO='").append(FIO).append('\'')
                .append(", regDate='").append(regDate).append('\'')
                .append('}');
        for (Message message : messageList)
            stringBuilder.append("\n").append(message);
        return stringBuilder.toString();
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

    public String getRegDate() {
        return regDate;
    }

    public List<User> getFriendsList() {
        return friendsList;
    }

    public List<UserAction> getActivityFeed() {
        return activityFeed;
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    /**
     * Процедура добавления друга
     *
     * @param friend новый друг
     */
    public void addFriend(User friend) {
        this.friendsList.add(friend);
    }

    /**
     * Процедура отправки сообщения
     *
     * @param message сообщение
     */
    public void sendMessage(Message message) {
        this.messageList.add(message);
    }

    /**
     * Метод создания снимка
     *
     * @return новый снимок
     */
    public Memento takeSnapshot() {
        return new UserSnapshot(this);
    }

}
