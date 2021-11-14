package visitor;

import composite.*;

/**
 * Реализация посетителя-экспортера в формате XML
 *
 * @see ExportVisitor
 */
public class XMLExportVisitor implements ExportVisitor {

    /**
     * Метод экспортирования в формате XML списка графических компонентов
     *
     * @param components список графических компонентов
     * @return строка в формате XML
     */
    public String exportComponents(GraphicalComponent... components) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n");
        for (GraphicalComponent component : components)
            stringBuilder.append(component.export(this));
        return stringBuilder.toString();
    }

    /**
     * Метод экспортирования графического примитива ОС Android в формате XML
     *
     * @param primitive примитив ОС Android
     * @return строка в формате XML
     */
    @Override
    public String exportAndroidPrimitive(AndroidPrimitive primitive) {
        return "<android_primitive>\n" +
                "\t<id>" + primitive.getId() + "</id>\n" +
                "</android_primitive>";
    }

    /**
     * Метод экспортирования графического примитива ОС IOS в формате XML
     *
     * @param primitive примитив ОС IOS
     * @return строка в формате XML
     */
    @Override
    public String exportIOSPrimitive(IOSPrimitive primitive) {
        return "<ios_primitive>\n" +
                "\t<id>" + primitive.getId() + "</id>\n" +
                "</ios_primitive>";
    }

    /**
     * Метод экспортирования графического примитива ОС Windows в формате XML
     *
     * @param primitive примитив ОС Windows
     * @return строка в формате XML
     */
    @Override
    public String exportWindowsPrimitive(WindowsPrimitive primitive) {
        return "<windows_primitive>\n" +
                "\t<id>" + primitive.getId() + "</id>\n" +
                "</windows_primitive>";
    }

    /**
     * Метод экспортирования составного графического объекта в формате XML
     *
     * @param compositeComponent составной графический объект
     * @return строка в формате XML
     */
    @Override
    public String exportCompositeComponent(CompositeGraphicalComponent compositeComponent) {
        StringBuilder stringBuilder = new StringBuilder();
        for (GraphicalComponent component : compositeComponent.componentList) {
            stringBuilder
                    .append("\t")
                    .append(component.export(this).replace("\n", "\n\t"))
                    .append("\n");
        }
        return "<composite_component>\n" +
                "\t<id>" + compositeComponent.getId() + "</id>\n" +
                stringBuilder +
                "</composite_component>";
    }

}
