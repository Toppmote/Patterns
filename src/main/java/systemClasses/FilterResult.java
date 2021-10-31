package systemClasses;

/**
 * Класс, описывающий результат фильтрации
 */
public class FilterResult {

    /**
     * Пользователь
     */
    private User user;

    /**
     * Сообщение
     */
    private Message message;

    /**
     * Процент вредоносности
     */
    private int harmPercent;

    public FilterResult(User user, Message message, int harmPercent) {
        this.user = user;
        this.message = message;
        this.harmPercent = harmPercent;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "FilterResult{" +
                "author=" + user +
                ", message=" + message +
                ", harmPercent=" + harmPercent +
                '}';
    }
}
