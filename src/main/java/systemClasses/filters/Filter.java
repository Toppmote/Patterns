package systemClasses.filters;

/**
 * Интерейс, представляющий фильтр
 */
public interface Filter {

    /**
     * Метод, возвращающий результат фильтрации в виде объекта {@link systemClasses.FilterResult}
     */
    void getResult();

}
