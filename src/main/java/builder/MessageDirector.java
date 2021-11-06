package builder;

import systemClasses.Message;
import systemClasses.User;
import systemClasses.messageContent.Text;

import java.util.Collections;
import java.util.List;

/**
 * Класс директора, определяющего создание той или иной конфигурации сообщения
 */
public class MessageDirector {

    /**
     * Объект строителя сообщения
     */
    private final Builder<Message> builder;

    public MessageDirector(Builder<Message> builder) {
        this.builder = builder;
    }

    /**
     * Метод создания пустого сообщения
     *
     * @param sender        отправитель
     * @param recipientList список получаетелей
     * @return пустое письмо
     */
    public Message createEmptyMessage(User sender, List<User> recipientList) {
        return Message.builder()
                .sender(sender)
                .recipientList(recipientList)
                .build();
    }

    /**
     * Метод создания текстового сообщения
     *
     * @param sender        отправитель
     * @param recipientList список получаетелей
     * @param text          текст сообщения
     * @return текстовое сообщение
     */
    public Message createTextMessage(User sender, List<User> recipientList, Text text) {
        return Message.builder()
                .sender(sender)
                .recipientList(recipientList)
                .contentList(Collections.singletonList(text))
                .build();
    }

}
