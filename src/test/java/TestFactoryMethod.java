import composite.AndroidPrimitive;
import composite.IOSPrimitive;
import composite.WindowsPrimitive;
import factory.AndroidPrimitiveCreator;
import factory.IOSPrimitiveCreator;
import factory.PrimitiveCreator;
import factory.WindowsPrimitiveCreator;
import org.junit.jupiter.api.Test;

public class TestFactoryMethod {

    @Test
    void testFactoryMethod() {
        System.out.println("------------FACTORY METHOD TEST-----------");
        PrimitiveCreator factory = new AndroidPrimitiveCreator();
        AndroidPrimitive androidPrimitive = (AndroidPrimitive) factory.createPrimitive("AP1");
        System.out.println(androidPrimitive.operation());
        factory = new WindowsPrimitiveCreator();
        WindowsPrimitive windowsPrimitive = (WindowsPrimitive) factory.createPrimitive("WP1");
        System.out.println(windowsPrimitive.operation());
        factory = new IOSPrimitiveCreator();
        IOSPrimitive iosPrimitive = (IOSPrimitive) factory.createPrimitive("IOS1");
        System.out.println(iosPrimitive.operation());
        System.out.println("------------------------------------------");
    }

}
