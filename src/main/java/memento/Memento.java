package memento;

import state.UserState;
import systemClasses.Message;
import systemClasses.User;
import systemClasses.userActions.UserAction;

import java.util.Date;
import java.util.List;

/**
 * Интерфейс снимка
 */
public interface Memento {

    /**
     * Метод получения состояния пользователя
     *
     * @return состояние пользователя
     */
    UserState getState();

    /**
     * Метод получения ФИО пользователя
     *
     * @return ФИО пользователя
     */
    String getFIO();

    /**
     * Метод получения даты снимка
     *
     * @return дата снимка
     */
    Date getDate();

    /**
     * Метод получения списка друзей пользователя
     *
     * @return список друзей пользователя
     */
    List<User> getFriendsList();

    /**
     * Метод получения ленты активности пользователя
     *
     * @return лента активности пользователя
     */
    List<UserAction> getActivityFeed();

    /**
     * Метод получения списка сообщений пользователя
     *
     * @return список сообщений пользователя
     */
    List<Message> getMessagesList();

}
