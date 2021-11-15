package abstractFactory.iosComponents;

import abstractFactory.components.TextBox;
import visitor.ExportVisitor;

/**
 * TextBox платформы IOS
 *
 * @see TextBox
 */
public class IOSTextBox extends TextBox {

    public IOSTextBox(String id) {
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
