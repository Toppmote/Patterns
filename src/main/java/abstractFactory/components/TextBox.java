package abstractFactory.components;

import composite.GraphicalPrimitive;

/**
 * Абстрактный класс, реализующий текстовое поле
 */
public abstract class TextBox extends GraphicalPrimitive {

    /**
     * ID TextBox
     */
    protected String id;

    /**
     * ID TextBox
     */
    protected String textValue;

    public TextBox(String id) {
        super(id);
        this.id = id;
    }

    /**
     * Процедура записи текста в TextBox
     *
     * @param text записываемый текст
     */
    public abstract void writeIn(String text);

}
