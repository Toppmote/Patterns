package composite;

public class WindowsPrimitive extends GraphicalPrimitive {

    public WindowsPrimitive(String id) {
        super(id);
    }

    @Override
    public String operation() {
        return "Windows primitive: " + this.id;
    }
}
