package systemClasses;

import lombok.Getter;
import lombok.Setter;
import systemClasses.messageContent.MessageContent;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Класс, описывающий сообщение
 */
@Getter
public class Message {

    /**
     * Отправитель
     */
    private final User sender;

    /**
     * Список получателей
     */
    private final List<User> recipientList;

    /**
     * Контент сообшения
     */
    @Setter
    private List<MessageContent> messageContent;

    public Message(User sender, List<User> recipientList, MessageContent... messageContent) {
        this.sender = sender;
        this.recipientList = recipientList;
        this.messageContent = Arrays.stream(messageContent).collect(Collectors.toList());
    }

}
