package builder;

/**
 * Интерфейс строителя
 *
 * @param <E>
 */
public interface Builder<E> {

    /**
     * Инициализация строителя
     */
    void builder();

    /**
     * Получение результатов работы строителя
     *
     * @return построенный объект
     */
    E build();

}
