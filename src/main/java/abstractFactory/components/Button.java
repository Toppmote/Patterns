package abstractFactory.components;

/**
 * Абстрактный класс, реализующий кнопку
 */
public abstract class Button {

    /**
     * ID кнопки
     */
    protected final String id;

    public Button(String id) {
        this.id = id;
    }

    /**
     * Процедура нажатия на кнопку
     */
    public abstract void click();

}
