package systemClasses;

import lombok.Getter;
import lombok.Setter;
import prototype.CloneableObj;
import systemClasses.messageContent.MessageContent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Класс, описывающий сообщение
 */
public class Message implements CloneableObj {

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
    private List<MessageContent> messageContent;

    public Message(User sender, List<User> recipientList, MessageContent... messageContent) {
        this.sender = sender;
        this.recipientList = recipientList;
        this.messageContent = Arrays.stream(messageContent).collect(Collectors.toList());
    }

    public Message(Message message) {
        this.sender = message.getSender();
        this.recipientList = new ArrayList<>(message.getRecipientList());
        this.messageContent = new ArrayList<>();
        for (MessageContent content : message.messageContent)
            this.messageContent.add((MessageContent) content.clone());
    }

    @Override
    public CloneableObj clone() {
        return new Message(this);
    }

    public User getSender() {
        return sender;
    }

    public List<User> getRecipientList() {
        return recipientList;
    }

    public List<MessageContent> getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(List<MessageContent> messageContent) {
        this.messageContent = messageContent;
    }
}
