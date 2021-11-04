package factory;

import composite.GraphicalPrimitive;
import composite.WindowsPrimitive;

/**
 * Класс-реализация создателя примитивов, создающий примитивы под Windows
 * @see PrimitiveCreator
 */
public class WindowsPrimitiveCreator implements PrimitiveCreator {

    @Override
    public GraphicalPrimitive createAlgorithm(String id) {
        return new WindowsPrimitive(id);
    }
}
