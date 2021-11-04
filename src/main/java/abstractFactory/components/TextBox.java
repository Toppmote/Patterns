package abstractFactory.components;

/**
 * Абстрактный класс, реализующий текстовое поле
 */
public abstract class TextBox {

    /**
     * ID TextBox
     */
    protected String id;

    /**
     * ID TextBox
     */
    protected String textValue;

    public TextBox(String id) {
        this.id = id;
    }

    /**
     * Процедура записи текста в TextBox
     *
     * @param text записываемый текст
     */
    public abstract void writeIn(String text);

}
