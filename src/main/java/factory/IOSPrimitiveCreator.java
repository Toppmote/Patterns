package factory;

import composite.AndroidPrimitive;
import composite.GraphicalPrimitive;

/**
 * Класс-реализация создателя примитивов, создающий примитивы под IOS
 * @see PrimitiveCreator
 */
public class IOSPrimitiveCreator implements PrimitiveCreator {

    @Override
    public GraphicalPrimitive createAlgorithm(String id) {
        return new AndroidPrimitive(id);
    }
}
