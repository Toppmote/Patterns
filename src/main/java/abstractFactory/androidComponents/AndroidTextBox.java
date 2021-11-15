package abstractFactory.androidComponents;

import abstractFactory.components.TextBox;
import visitor.ExportVisitor;

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
    public String export(ExportVisitor visitor) {
        return null;
    }

    @Override
    public void writeIn(String text) {
        this.textValue = text;
        System.out.println("Text was written in Android TextBox with ID: " + this.id);
    }
}
