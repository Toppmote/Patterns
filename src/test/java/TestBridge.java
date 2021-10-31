import bridge.Hibernate;
import bridge.Lombok;
import org.junit.jupiter.api.Test;
import systemClasses.SystemManager;

public class TestBridge {

    @Test
    void testBridge() {
        System.out.println("-----------BRIDGE TEST-----------");
        SystemManager manager = new SystemManager(new Hibernate());
        manager.frameworkOperation();

        manager.setFramework(new Lombok());
        manager.frameworkOperation();
        System.out.println("---------------------------------");
    }

}
