import abstractFactory.GraphicalComponentFactory;
import abstractFactory.components.Button;
import abstractFactory.components.TextBox;
import abstractFactory.factories.AndroidFactory;
import abstractFactory.factories.WindowsFactory;
import org.junit.jupiter.api.Test;

public class TestAbstractFactory {

    @Test
    void testAbstractFactory() {
        System.out.println("------------ABSTRACT FACTORY TEST-----------");
        GraphicalComponentFactory factory = new AndroidFactory();
        Button androidButton = factory.createButton("ButtonAndroid");
        TextBox androidTextBox = factory.createTextBox("TextBoxAndroid");
        androidButton.click();
        androidTextBox.writeIn("Hello, Android");
        System.out.println();

        factory = new WindowsFactory();
        Button windowsButton = factory.createButton("ButtonWindows");
        TextBox windowsTextBox = factory.createTextBox("TextBoxWindows");
        windowsButton.click();
        windowsTextBox.writeIn("Hello, Windows");
        System.out.println();

        factory = new WindowsFactory();
        Button iosButton = factory.createButton("ButtonIOS");
        TextBox iosTextBox = factory.createTextBox("TextBoxIOS");
        iosButton.click();
        iosTextBox.writeIn("Hello, IOS");
        System.out.println("--------------------------------------------");
    }

}
