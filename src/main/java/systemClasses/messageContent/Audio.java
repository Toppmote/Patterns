package systemClasses.messageContent;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Класс, реализующий аудиоконтент сообщения
 */
@EqualsAndHashCode
public class Audio implements MessageContent {

    @Setter
    @Getter
    private int audioHashValue;

    public Audio(int audioHashValue) {
        this.audioHashValue = audioHashValue;
    }

    @Override
    public int getContentHashCode() {
        return this.hashCode();
    }

}
