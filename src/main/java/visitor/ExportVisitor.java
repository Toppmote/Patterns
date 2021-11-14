package visitor;

import composite.*;

/**
 * Интерфейс поситителя-экспортера
 */
public interface ExportVisitor {

    /**
     * Метод экспортирования списка графических компонентов
     *
     * @param components список графических компонентов
     * @return строка в экспортируемом формате
     */
    String exportComponents(GraphicalComponent... components);

    /**
     * Метод экспортирования графического примитива ОС Android
     * @param primitive примитив ОС Android
     * @return строка в экспортируемом формате
     */
    String exportAndroidPrimitive(AndroidPrimitive primitive);

    /**
     * Метод экспортирования графического примитива ОС IOS
     * @param primitive примитив ОС IOS
     * @return строка в экспортируемом формате
     */
    String exportIOSPrimitive(IOSPrimitive primitive);

    /**
     * Метод экспортирования графического примитива ОС Windows
     * @param primitive примитив ОС Windows
     * @return строка в экспортируемом формате
     */
    String exportWindowsPrimitive(WindowsPrimitive primitive);

    /**
     * Метод экспортирования составного графического объекта
     * @param component составной графический объект
     * @return строка в экспортируемом формате
     */
    String exportCompositeComponent(CompositeGraphicalComponent component);

}
