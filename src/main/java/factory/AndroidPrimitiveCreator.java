package factory;

import composite.AndroidPrimitive;
import composite.GraphicalPrimitive;

/**
 * Класс-реализация создателя примитивов, создающий примитивы под Android
 * @see PrimitiveCreator
 */
public class AndroidPrimitiveCreator implements PrimitiveCreator {

    @Override
    public GraphicalPrimitive createAlgorithm(String id) {
        return new AndroidPrimitive(id);
    }
}
