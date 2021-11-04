package abstractFactory.factories;

import abstractFactory.components.Button;
import abstractFactory.GraphicalComponentFactory;
import abstractFactory.components.TextBox;
import abstractFactory.windowsComponents.WindowsButton;
import abstractFactory.windowsComponents.WindowsTextBox;

/**
 * Фабрика графических компонентов платформы Windows
 *
 * @see GraphicalComponentFactory
 */
public class WindowsFactory implements GraphicalComponentFactory {

    @Override
    public Button createButton(String id) {
        return new WindowsButton(id);
    }

    @Override
    public TextBox createTextBox(String id) {
        return new WindowsTextBox(id);
    }
}
