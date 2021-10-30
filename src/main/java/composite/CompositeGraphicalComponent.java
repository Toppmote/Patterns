package composite;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Составной компонент GUI, не имеющий ветвлений
 */
public class CompositeGraphicalComponent extends GraphicalComponent {

    /**
     * Список графических примитивов, входящих в состав составного графического компонента
     */
    List<GraphicalComponent> componentList;

    public CompositeGraphicalComponent(String id, GraphicalComponent... primitiveList) {
        super(id);
        this.componentList = Arrays.stream(primitiveList).collect(Collectors.toList());
        System.out.println("Composite component " + id + " has been created");
    }

    /**
     * @see GraphicalComponent
     */
    @Override
    public void addComponent(GraphicalComponent component) {
        componentList.add(component);
        System.out.println("Component" + component.id + " has been added");
    }

    /**
     * @see GraphicalComponent
     */
    @Override
    public void removeComponent(GraphicalComponent component) {
        componentList.remove(component);
        System.out.println("Component" + component.id + " has been removed");
    }

    /**
     * @see GraphicalComponent
     */
    @Override
    public String operation() {
        StringBuilder result = new StringBuilder("Composite component(");
        int currComponentNumber = 0;
        for (GraphicalComponent component : componentList) {
            result.append(component.operation());
            if (currComponentNumber++ != componentList.size() - 1)
                result.append(" + ");
        }
        result.append(")");
        return result.toString();
    }

    /**
     * @see GraphicalComponent
     */
    @Override
    public boolean isComposite() {
        return true;
    }
}
