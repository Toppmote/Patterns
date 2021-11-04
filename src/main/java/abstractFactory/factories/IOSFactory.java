package abstractFactory.factories;

import abstractFactory.components.Button;
import abstractFactory.GraphicalComponentFactory;
import abstractFactory.components.TextBox;
import abstractFactory.iosComponents.IOSButton;
import abstractFactory.iosComponents.IOSTextBox;

/**
 * Фабрика графических компонентов платформы IOS
 *
 * @see GraphicalComponentFactory
 */
public class IOSFactory implements GraphicalComponentFactory {

    @Override
    public Button createButton(String id) {
        return new IOSButton(id);
    }

    @Override
    public TextBox createTextBox(String id) {
        return new IOSTextBox(id);
    }
}
