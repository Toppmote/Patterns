package systemClasses.messageContent;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Класс, реализующий текст сообщения
 */
@EqualsAndHashCode
public class Text implements MessageContent {

    @Setter
    @Getter
    private String textValue;

    public Text(String textValue) {
        this.textValue = textValue;
    }

    @Override
    public int getContentHashCode() {
        return 0;
    }

}
