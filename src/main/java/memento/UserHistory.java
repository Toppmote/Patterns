package memento;

import systemClasses.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, содержащий все снимки пользователя. Работает со снимками через интерфейс
 */
public class UserHistory {

    /**
     * Список снимков пользователя
     */
    private final List<Memento> mementoList;

    /**
     * Пользователь
     */
    private final User user;

    public UserHistory(User user) {
        this.mementoList = new ArrayList<>();
        this.user = user;
    }

    /**
     * Процедура сохранения нового снимка
     */
    public void save() {
        this.mementoList.add(this.user.takeSnapshot());
    }

    /**
     * Геттер для списка снимков
     *
     * @return список снимков
     */
    public List<Memento> getHistory() {
        return this.mementoList;
    }

    /**
     * Геттер для пользователя
     *
     * @return пользователь
     */
    public User getUser() {
        return user;
    }

    /**
     * Процедура отката последних изменений
     */
    public void undo() {
        if (this.mementoList.size() == 0)
            return;
        Memento lastMemento = this.mementoList.get(this.mementoList.size() - 1);
        this.mementoList.remove(lastMemento);
        try {
            this.user.undoLastChanges(lastMemento);
        }
        catch (Exception e) {
            e.printStackTrace();
            this.undo();
        }
    }

}
