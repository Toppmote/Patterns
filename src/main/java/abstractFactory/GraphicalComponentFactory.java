package abstractFactory;

import abstractFactory.components.Button;
import abstractFactory.components.TextBox;

/**
 * Абстрактная фабрика графических компонентов
 */
public interface GraphicalComponentFactory {

    /**
     * Метод создания кнопки
     *
     * @param id ID кнопки
     * @return новый объект кнопки
     */
    Button createButton(String id);

    /**
     * Метод создания TextBox
     *
     * @param id ID TextBox
     * @return новый объект TextBox
     */
    TextBox createTextBox(String id);

}
