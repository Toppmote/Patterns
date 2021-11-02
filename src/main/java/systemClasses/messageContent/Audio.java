package systemClasses.messageContent;

import prototype.CloneableObj;

/**
 * Класс, реализующий аудиоконтент сообщения
 */
public class Audio implements MessageContent {

    private int audioHashValue;

    public Audio(int audioHashValue) {
        this.audioHashValue = audioHashValue;
    }

    public Audio(Audio audio) {
        this.audioHashValue = audio.getAudioHashValue();
    }

    @Override
    public int getContentHashCode() {
        return this.hashCode();
    }

    @Override
    public CloneableObj clone() {
        return new Audio(this);
    }

    public int getAudioHashValue() {
        return audioHashValue;
    }

    public void setAudioHashValue(int audioHashValue) {
        this.audioHashValue = audioHashValue;
    }
}
