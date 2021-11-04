package abstractFactory.windowsComponents;

import abstractFactory.components.TextBox;

/**
 * TextBox платформы Windows
 *
 * @see TextBox
 */
public class WindowsTextBox extends TextBox {

    public WindowsTextBox(String id) {
        super(id);
    }

    @Override
    public void writeIn(String text) {
        this.textValue = text;
        System.out.println("Text was written in Android TextBox with ID: " + this.id);
    }
}

