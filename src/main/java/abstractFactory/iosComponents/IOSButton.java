package abstractFactory.iosComponents;

import abstractFactory.components.Button;
import visitor.ExportVisitor;

/**
 * Класс кнопки платформы IOS
 *
 * @see Button
 */
public class IOSButton extends Button {

    public IOSButton(String id) {
        super(id);
    }

    @Override
    public String export(ExportVisitor visitor) {
        return null;
    }

    @Override
    public void click() {
        System.out.println("IOS button " + this.id + " got clicked");
    }

}
