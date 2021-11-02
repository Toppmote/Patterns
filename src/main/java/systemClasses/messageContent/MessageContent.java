package systemClasses.messageContent;

import prototype.CloneableObj;

/**
 * Интерфейс, представляющий контент сообщения
 */
public interface MessageContent extends CloneableObj {

    /**
     * Получить хэш-код контента
     *
     * @return хэш код
     */
    int getContentHashCode();

}
