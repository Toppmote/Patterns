package abstractFactory.androidComponents;

import abstractFactory.components.Button;

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
    public void click() {
        System.out.println("Android button " + this.id + " got clicked");
    }
}
