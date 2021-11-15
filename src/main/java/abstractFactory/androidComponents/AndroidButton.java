package abstractFactory.androidComponents;

import abstractFactory.components.Button;
import visitor.ExportVisitor;

/**
 * Класс кнопки платформы Android
 *
 * @see Button
 */
public class AndroidButton extends Button {

    public AndroidButton(String id) {
        super(id);
    }

    @Override
    public String export(ExportVisitor visitor) {
        return null;
    }

    @Override
    public void click() {
        System.out.println("Android button " + this.id + " got clicked");
    }
}
