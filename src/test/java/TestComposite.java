import composite.CompositeGraphicalComponent;
import composite.GraphicalComponent;
import composite.GraphicalPrimitive;
import composite.WindowsPrimitive;
import org.junit.jupiter.api.Test;

public class TestComposite {

    @Test
    void testComposite() {
        System.out.println("-----------COMPOSITE TEST-----------");
        GraphicalComponent primitive1 = new WindowsPrimitive("primitive1");
        System.out.println(primitive1.operation());

        GraphicalComponent primitive2 = new WindowsPrimitive("primitive2");
        GraphicalComponent primitive3 = new WindowsPrimitive("primitive3");
        GraphicalComponent primitive4 = new WindowsPrimitive("primitive4");
        GraphicalComponent primitive5 = new WindowsPrimitive("primitive5");

        GraphicalComponent composite1 = new CompositeGraphicalComponent("composite1", primitive2, primitive3);
        System.out.println(composite1.operation());

        GraphicalComponent composite2 = new
                CompositeGraphicalComponent("composite2", primitive4, primitive5, composite1);
        System.out.println(composite2.operation());
        System.out.println("-------------------------------------");
    }

}
