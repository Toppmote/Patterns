package systemClasses;

import bridge.Framework;
import iterator.IterableCollection;
import iterator.Iterator;
import iterator.ListIterator;
import systemClasses.filters.Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Класс менеджера системы
 */
public class SystemManager implements IterableCollection {

    /**
     * Список пользователей
     */
    private final List<User> userList;

    /**
     * Фильтр, используемый системой
     */
    private Filter filter;

    /**
     * Фреймворк, который использует система
     */
    private Framework framework;

    public SystemManager() {
        this.userList = new ArrayList<>();
        this.filter = null;
        this.framework = null;
        System.out.println("System manager has been initialized");
    }

    public SystemManager(Framework framework) {
        this.userList = new ArrayList<>();
        this.filter = null;
        this.framework = framework;
        System.out.println("System manager with " + framework.getClass().getName()
                + " framework has been initialized");
    }

    /**
     * Процедура регистрации нового пользователя
     *
     * @param FIO     ФИО
     * @param regDate дата регистрации
     */
    public void newUserRegistration(String FIO, String regDate) {
        User newUser = new User(FIO, regDate);
        userList.add(newUser);
        System.out.println("New user has been added");
    }

    /**
     * @see IterableCollection
     */
    @Override
    public Iterator<?> createIterator() {
        return new ListIterator<>(userList);
    }

    /**
     * Метод поиска пользователей по имени
     *
     * @param FIO ФИО для поиска
     * @return список найденных пользователей
     */
    public List<User> findUsersByFIO(String FIO) {
        return userList.stream()
                .filter(user -> user.FIO.equals(FIO))
                .collect(Collectors.toList());
    }

    /**
     * Метод поиска пользователей по имени
     *
     * @param id ID для поиска
     * @return найденный пользователь
     */
    public Optional<User> findUsersByID(int id) {
        return userList.stream()
                .filter(currUser -> currUser.getId() == id)
                .findFirst();
    }

    /**
     * Метод поиска результатов фильтрации по ID пользователя
     *
     * @param id ID для поиска
     * @return найденный пользователь
     */
    public List<FilterResult> findFilterResultByUserID(int id) {
        Optional<User> user = this.findUsersByID(id);
        return user.map(value -> filter.findFilterResultByUser(value)).orElse(null);
    }

    /**
     * Метод добавления нового пользователя в список пользователей
     *
     * @param user новый пользователь
     */
    public void addUser(User user) {
        this.userList.add(user);
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public void frameworkOperation() {
        framework.operation();
    }

    public void setFramework(Framework framework) {
        this.framework = framework;
        System.out.println("Framework " + framework.getClass().getName()
                + " has been set");
    }
}
