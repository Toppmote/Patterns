package systemClasses.filters;

import systemClasses.Message;
import systemClasses.User;

/**
 * Интерейс, представляющий фильтр
 */
public interface Filter {

    /**
     * Метод, возвращающий результат фильтрации в виде объекта {@link systemClasses.FilterResult}
     */
    void getResult(User user, Message message);

}
