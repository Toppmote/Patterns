package composite;

import visitor.ExportVisitor;

/**
 * Примитив ОС Android
 *
 * @see composite.GraphicalComponent
 * @see composite.GraphicalPrimitive
 * @see ExportVisitor
 */
public class AndroidPrimitive extends GraphicalPrimitive {

    public AndroidPrimitive(String id) {
        super(id);
    }

    @Override
    public String operation() {
        return "Android primitive: " + this.id;
    }

    @Override
    public String export(ExportVisitor visitor) {
        return visitor.exportAndroidPrimitive(this);
    }

}
