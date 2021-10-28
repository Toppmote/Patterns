package systemClasses.filters;

import lombok.Getter;
import lombok.Setter;
import systemClasses.FilterResult;
import systemClasses.algorithms.Algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, реализующий фильтр объектов
 */
public class FilterObj implements Filter {

    /**
     * Алгоритм фильтрации
     */
    @Getter
    @Setter
    private Algorithm algorithm;

    /**
     * Список результатов, полученных с помощью данного фильтра
     */
    @Getter
    private final List<FilterResult> results;

    public FilterObj(Algorithm algorithm) {
        this.algorithm = algorithm;
        this.results = new ArrayList<>();
    }

    @Override
    public void getResult() {

    }

}
