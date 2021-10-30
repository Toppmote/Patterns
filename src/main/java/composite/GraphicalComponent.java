package composite;

import java.util.NoSuchElementException;

/**
 * Общий интерфейс для простых и составных компонентов GUI
 */
public abstract class GraphicalComponent {

    /**
     * ID компонента
     */
    protected String id;

    public GraphicalComponent(String id) {
        this.id = id;
    }

    /**
     * Некоторое поведение графичесого компонента
     */
    public abstract String operation();

    /**
     * Процедура добавления нового потомка
     *
     * @param component потомок
     * @throws NoSuchFieldException для простых графических элементов выбрасываем исключение
     */
    public void addComponent(GraphicalComponent component) throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    /**
     * Процедура удаления потомка
     *
     * @param component потомок
     * @throws NoSuchElementException для простых графических элементов выбрасываем исключение
     */
    public void removeComponent(GraphicalComponent component) {
        throw new NoSuchElementException();
    }

    /**
     * Метод, позволяющий понять, может ли графический компонент иметь потомков
     *
     * @return true - если может, false - если нет
     */
    public boolean isComposite() {
        return false;
    }

}
