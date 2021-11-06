package systemClasses;

import builder.MessageBuilder;
import prototype.CloneableObj;
import systemClasses.messageContent.MessageContent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Класс, описывающий сообщение
 */
public class Message implements CloneableObj {

    /**
     * Отправитель
     */
    private User sender;

    /**
     * Список получателей
     */
    private List<User> recipientList;

    /**
     * Контент сообшения
     */
    private List<MessageContent> messageContent;

    public Message() {
        sender = null;
        recipientList = null;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(getSender(), message.getSender())
                && Objects.equals(getRecipientList(), message.getRecipientList())
                && Objects.equals(getMessageContent(), message.getMessageContent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSender(), getRecipientList(), getMessageContent());
    }

    /**
     * Статический метод, созвращающий объект строителя для удобного создания экземпляра сообщения
     * @return объект строителя сообщения
     */
    public static MessageBuilder builder() {
        return new MessageBuilder();
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

    public void setSender(User sender) {
        this.sender = sender;
    }

    public void setRecipientList(List<User> recipientList) {
        this.recipientList = recipientList;
    }

    public void setMessageContent(List<MessageContent> messageContent) {
        this.messageContent = messageContent;
    }
}
