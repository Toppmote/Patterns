package systemClasses.messageContent;

import prototype.CloneableObj;

/**
 * Класс, реализующий видеоконтент сообщения
 */
public class Video implements MessageContent {

    private String title;

    private int videoHashValue;

    public Video(int videoHashValue) {
        this.videoHashValue = videoHashValue;
    }

    public Video(Video video) {
        this.title = video.getTitle();
        this.videoHashValue = video.getVideoHashValue();
    }

    @Override
    public int getContentHashCode() {
        return this.hashCode();
    }

    @Override
    public CloneableObj clone() {
        return new Video(this);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getVideoHashValue() {
        return videoHashValue;
    }

    public void setVideoHashValue(int videoHashValue) {
        this.videoHashValue = videoHashValue;
    }
}
