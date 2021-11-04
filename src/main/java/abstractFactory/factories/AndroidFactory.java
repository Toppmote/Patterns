package abstractFactory.factories;

import abstractFactory.components.Button;
import abstractFactory.GraphicalComponentFactory;
import abstractFactory.components.TextBox;
import abstractFactory.androidComponents.AndroidButton;
import abstractFactory.androidComponents.AndroidTextBox;

/**
 * Фабрика графических компонентов платформы Android
 * @see GraphicalComponentFactory
 */
public class AndroidFactory implements GraphicalComponentFactory {

    @Override
    public Button createButton(String id) {
        return new AndroidButton(id);
    }

    @Override
    public TextBox createTextBox(String id) {
        return new AndroidTextBox(id);
    }
}
