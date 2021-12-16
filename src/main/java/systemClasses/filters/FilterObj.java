package systemClasses.filters;

import observer.Group;
import systemClasses.FilterResult;
import systemClasses.Message;
import systemClasses.User;
import strategy.Algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Класс, реализующий фильтр объектов
 * @see Filter
 */
public class FilterObj implements Filter {

    /**
     * Алгоритм фильтрации
     */
    private Algorithm algorithm;

    /**
     * Список результатов, полученных с помощью данного фильтра
     */
    private final List<FilterResult> results;

    public FilterObj(Algorithm algorithm) {
        System.out.println("Main filter has been initialized");
        this.algorithm = algorithm;
        this.results = new ArrayList<>();
    }

    @Override
    public void computeResult(User user, Message message) {
        System.out.println("Main filter start working");
        results.add(algorithm.runAlgorithm(user, message));
        System.out.println("Main filter finished working");
    }

    public List<FilterResult> getResults() {
        return results;
    }

    public List<FilterResult> findFilterResultByUser(User user) {
        return results.stream()
                .filter(filterResult -> filterResult.getUser().equals(user))
                .collect(Collectors.toList());
    }

    public void addFilterResult(FilterResult result) {
        this.results.add(result);
    }

    public Algorithm getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public void react(Group group) {
        System.out.println("System filter reacted to the new post of the \"" + group.name + "\" group");
    }
}
