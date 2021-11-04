package factory;

import composite.GraphicalPrimitive;

/**
 * Интерфейс, реализующий абстрактную фабрику по созданию графических примитивов
 */
public interface PrimitiveCreator {

    /**
     * Метод создания графического примитива
     * @param id ID примитива
     * @return созданный примитив
     */
    GraphicalPrimitive createAlgorithm(String id);

}
