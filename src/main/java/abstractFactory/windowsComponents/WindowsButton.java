package abstractFactory.windowsComponents;

import abstractFactory.components.Button;
import visitor.ExportVisitor;

/**
 * Класс кнопки платформы Windows
 *
 * @see Button
 */
public class WindowsButton extends Button {

    public WindowsButton(String id) {
        super(id);
    }

    @Override
    public String export(ExportVisitor visitor) {
        return null;
    }

    @Override
    public void click() {
        System.out.println("Windows button " + this.id + " got clicked");
    }

}
