package proxy;

import systemClasses.Message;
import systemClasses.User;
import systemClasses.filters.Filter;

public class ProxyFilter implements Filter{

    private Filter filter;

    public ProxyFilter(Filter filter) {
        System.out.println("Proxy filter has been initialized");
        this.filter = filter;
    }

    @Override
    public void getResult(User user, Message message) {
        System.out.println("Proxy filter start working");
        filter.getResult(user, message);
        System.out.println("Proxy filter finished working");
    }
}
