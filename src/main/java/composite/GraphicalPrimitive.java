package composite;

/**
 * Простой компонент GUI, не имеющий ветвлений
 *
 * @see composite.GraphicalComponent
 */
public abstract class GraphicalPrimitive extends GraphicalComponent {

    public GraphicalPrimitive(String id) {
        super(id);
        System.out.println("Primitive " + id + " has been created");
    }

    /**
     * @see GraphicalComponent
     */
    @Override
    public String operation() {
        return "Primitive: " + this.id;
    }

}
