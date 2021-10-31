package proxy;

import lombok.Setter;
import systemClasses.FilterResult;
import systemClasses.Message;
import systemClasses.User;
import systemClasses.filters.Filter;

import java.util.List;

/**
 * Прокси фильтр для главного фильтра
 * @see Filter
 */
public class ProxyFilter implements Filter {

    @Setter
    private Filter filter;

    public ProxyFilter(Filter filter) {
        System.out.println("Proxy filter has been initialized");
        this.filter = filter;
    }

    @Override
    public void computeResult(User user, Message message) {
        System.out.println("Proxy filter start working");
        filter.computeResult(user, message);
        System.out.println("Proxy filter finished working");
    }

    @Override
    public List<FilterResult> getResults() {
        return this.filter.getResults();
    }

    @Override
    public List<FilterResult> findFilterResultByUser(User user) {
        return this.filter.findFilterResultByUser(user);
    }

    @Override
    public void addFilterResult(FilterResult result) {
        this.filter.addFilterResult(result);
    }

}
