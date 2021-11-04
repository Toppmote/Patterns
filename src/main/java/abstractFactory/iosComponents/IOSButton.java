package abstractFactory.iosComponents;

import abstractFactory.components.Button;

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
    public void click() {
        System.out.println("IOS button " + this.id + " got clicked");
    }

}
