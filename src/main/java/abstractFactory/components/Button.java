package abstractFactory.components;

import composite.GraphicalPrimitive;

/**
 * Абстрактный класс, реализующий кнопку
 */
public abstract class Button extends GraphicalPrimitive {

    /**
     * ID кнопки
     */
    protected final String id;

    public Button(String id) {
        super(id);
        this.id = id;
    }

    /**
     * Процедура нажатия на кнопку
     */
    public abstract void click();

}
