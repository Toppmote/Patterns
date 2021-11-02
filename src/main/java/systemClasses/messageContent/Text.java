package systemClasses.messageContent;

import prototype.CloneableObj;

/**
 * Класс, реализующий текст сообщения
 */
public class Text implements MessageContent {

    private String textValue;

    public Text(String textValue) {
        this.textValue = textValue;
    }

    public Text(Text text) {
        this.textValue = text.getTextValue();
    }

    @Override
    public int getContentHashCode() {
        return 0;
    }

    @Override
    public CloneableObj clone() {
        return null;
    }

    public String getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }
}
