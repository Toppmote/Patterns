package systemClasses.messageContent;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Класс, реализующий фотоконтент сообщения
 */
@EqualsAndHashCode
public class Photo implements MessageContent {

    @Setter
    @Getter
    private int PhotoValue;

    public Photo(int photoValue) {
        PhotoValue = photoValue;
    }

    @Override
    public int getContentHashCode() {
        return this.hashCode();
    }

}
