package composite;

/**
 * Простой компонент GUI, не имеющий ветвлений
 */
public class GraphicalPrimitive extends GraphicalComponent {

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
