package systemClasses.filters;

import lombok.Getter;
import lombok.Setter;
import systemClasses.FilterResult;
import systemClasses.Message;
import systemClasses.User;
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
        System.out.println("Main filter has been initialized");
        this.algorithm = algorithm;
        this.results = new ArrayList<>();
    }

    @Override
    public void getResult(User user, Message message) {
        System.out.println("Main filter start working");
        results.add(algorithm.runAlgorithm(user, message));
        System.out.println("Main filter finished working");
    }

}
