import composite.AndroidPrimitive;
import composite.CompositeGraphicalComponent;
import composite.IOSPrimitive;
import composite.WindowsPrimitive;
import org.junit.jupiter.api.Test;
import visitor.ExportVisitor;
import visitor.XMLExportVisitor;

public class TestVisitor {

    @Test
    void testVisitor() {
        System.out.println("-----------VISITOR TEST-----------");
        AndroidPrimitive androidPrimitive = new AndroidPrimitive("ap1");
        IOSPrimitive iosPrimitive = new IOSPrimitive("ip1");
        WindowsPrimitive windowsPrimitive = new WindowsPrimitive("wp1");
        CompositeGraphicalComponent compositeGraphicalComponent =
                new CompositeGraphicalComponent("comp1", androidPrimitive, iosPrimitive, windowsPrimitive);
        ExportVisitor visitor = new XMLExportVisitor();

        System.out.println("\nXML file:");
        System.out.println(visitor.exportComponents(compositeGraphicalComponent));
        System.out.println("----------------------------------");
    }

}
