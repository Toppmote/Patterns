package composite;

import visitor.ExportVisitor;

/**
 * Примитив ОС IOS
 *
 * @see composite.GraphicalComponent
 * @see composite.GraphicalPrimitive
 * @see ExportVisitor
 */
public class IOSPrimitive extends GraphicalPrimitive {

    public IOSPrimitive(String id) {
        super(id);
    }

    @Override
    public String operation() {
        return "IOS primitive: " + this.id;
    }

    @Override
    public String export(ExportVisitor visitor) {
        return visitor.exportIOSPrimitive(this);
    }

}
