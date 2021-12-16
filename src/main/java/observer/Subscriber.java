package observer;

/**
 * Интерфейс подписчиков, реагирующих на изменения класса-издателя
 */
public interface Subscriber {

    /**
     * Метод реакции на изменения класса-издателя
     */
    void react(Group group);

}
