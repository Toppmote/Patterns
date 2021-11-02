package systemClasses.messageContent;

import prototype.CloneableObj;

/**
 * Класс, реализующий фотоконтент сообщения
 */
public class Photo implements MessageContent {

    private int PhotoValue;

    public Photo(int photoValue) {
        PhotoValue = photoValue;
    }

    public Photo(Photo photo) {
        this.PhotoValue = photo.getPhotoValue();
    }

    @Override
    public int getContentHashCode() {
        return this.hashCode();
    }

    @Override
    public CloneableObj clone() {
        return new Photo(this);
    }

    public int getPhotoValue() {
        return PhotoValue;
    }

    public void setPhotoValue(int photoValue) {
        PhotoValue = photoValue;
    }
}
