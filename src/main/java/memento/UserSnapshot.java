package memento;

import state.UserState;
import systemClasses.Message;
import systemClasses.User;
import systemClasses.userActions.UserAction;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Снимок состояния пользователя
 *
 * @see Memento
 */
public class UserSnapshot implements Memento {

    /**
     * ФИО пользователя
     */
    private final String FIO;

    private final Date snapshotDate;

    /**
     * Список друзей
     */
    private final List<User> friendsList;

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
    private final UserState state;

    public UserSnapshot(User user) {
        this.FIO = user.FIO;
        this.snapshotDate = new Date();
        this.friendsList = new ArrayList<>(user.friendsList);
        this.activityFeed = new ArrayList<>(user.getActivityFeed());
        this.messageList = new ArrayList<>(user.getMessageList());
        this.state = user.getState();
        System.out.println("Snapshot has been taken. Date: " + snapshotDate);
    }

    @Override
    public UserState getState() {
        return this.state;
    }

    @Override
    public String getFIO() {
        return this.FIO;
    }

    @Override
    public Date getDate() {
        return this.snapshotDate;
    }

    @Override
    public List<User> getFriendsList() {
        return this.friendsList;
    }

    @Override
    public List<UserAction> getActivityFeed() {
        return this.activityFeed;
    }

    @Override
    public List<Message> getMessagesList() {
        return this.messageList;
    }
}
