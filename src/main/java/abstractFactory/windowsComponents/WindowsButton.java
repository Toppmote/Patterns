package abstractFactory.windowsComponents;

import abstractFactory.components.Button;

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
    public void click() {
        System.out.println("Windows button " + this.id + " got clicked");
    }

}
