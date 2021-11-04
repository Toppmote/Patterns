package abstractFactory.androidComponents;

import abstractFactory.components.TextBox;

/**
 * TextBox платформы Android
 *
 * @see TextBox
 */
public class AndroidTextBox extends TextBox {

    public AndroidTextBox(String id) {
        super(id);
    }

    @Override
    public void writeIn(String text) {
        this.textValue = text;
        System.out.println("Text was written in Android TextBox" + this.id);
    }
}
