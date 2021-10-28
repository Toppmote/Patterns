package systemClasses.messageContent;

/**
 * Интерфейс, представляющий контент сообщения
 */
public interface MessageContent {

    /**
     * Получить хэш-код контента
     * @return хэш код
     */
    int getContentHashCode();

}
