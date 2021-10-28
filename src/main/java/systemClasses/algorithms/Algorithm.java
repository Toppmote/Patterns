package systemClasses.algorithms;

import systemClasses.FilterResult;
import systemClasses.Message;
import systemClasses.User;

/**
 * Интерфейс, описывающий алгоритмы фильтрации
 */
public interface Algorithm {

    /**
     * Метод запуска алгоритма
     */
    FilterResult runAlgorithm(User user, Message message);

}
