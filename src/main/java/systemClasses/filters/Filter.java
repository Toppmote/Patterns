package systemClasses.filters;

import observer.Subscriber;
import systemClasses.FilterResult;
import systemClasses.Message;
import systemClasses.User;

import java.util.List;

/**
 * Интерейс, представляющий фильтр. Наследуется от интерфейса-подписчика
 */
public interface Filter extends Subscriber {

    /**
     * Метод, возвращающий результат фильтрации в виде объекта {@link systemClasses.FilterResult}
     */
    void computeResult(User user, Message message);

    /**
     * Метод получения списка результатов фильтрации
     * @return список результатов фильтрации
     */
    List<FilterResult> getResults();

    /**
     * Метод поиска результатов фильтрации по пользователю
     * @return список найденных результатов фильтрации
     */
    List<FilterResult> findFilterResultByUser(User user);

    /**
     * Метод добавления результата фильтрации
     * @param result результат фильтрации
     */
    void addFilterResult(FilterResult result);

}
