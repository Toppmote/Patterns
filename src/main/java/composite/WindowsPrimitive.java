package composite;

import visitor.ExportVisitor;

/**
 * Примитив ОС Windows
 *
 * @see composite.GraphicalComponent
 * @see composite.GraphicalPrimitive
 * @see ExportVisitor
 */
public class WindowsPrimitive extends GraphicalPrimitive {

    public WindowsPrimitive(String id) {
        super(id);
    }

    @Override
    public String operation() {
        return "Windows primitive: " + this.id;
    }

    @Override
    public String export(ExportVisitor visitor) {
        return visitor.exportWindowsPrimitive(this);
    }
}
