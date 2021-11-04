package factory;

import composite.GraphicalPrimitive;
import composite.IOSPrimitive;

/**
 * Класс-реализация создателя примитивов, создающий примитивы под IOS
 * @see PrimitiveCreator
 */
public class IOSPrimitiveCreator implements PrimitiveCreator {

    @Override
    public GraphicalPrimitive createPrimitive(String id) {
        return new IOSPrimitive(id);
    }
}
