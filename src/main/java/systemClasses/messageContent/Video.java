package systemClasses.messageContent;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Класс, реализующий видеоконтент сообщения
 */
@EqualsAndHashCode
public class Video implements MessageContent {

    @Getter
    private String title;

    @Setter
    @Getter
    private int videoHashValue;

    public Video(int videoHashValue) {
        this.videoHashValue = videoHashValue;
    }

    @Override
    public int getContentHashCode() {
        return this.hashCode();
    }

}
