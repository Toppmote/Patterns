package systemClasses;

import lombok.Getter;

/**
 * Класс, описывающий результат фильтрации
 */
@Getter
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

}
