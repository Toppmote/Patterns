package systemClasses;

import chainOfResponsibility.BaseCheck;
import iterator.IterableCollection;
import iterator.Iterator;
import iterator.ListIterator;
import observer.Group;
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

    private BaseCheck chainCheck;

    /**
     * Фильтр, используемый системой
     */
    private Filter filter;

    public SystemManager() {
        this.userList = new ArrayList<>();
        this.filter = null;
        this.chainCheck = null;
        System.out.println("System manager has been initialized");
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

    public List<User> getUserList() {
        return userList;
    }

    public void setChainCheck(BaseCheck chainCheck) {
        this.chainCheck = chainCheck;
    }

    public void logIn(String FIO) {
        System.out.println(FIO + " is trying to log in");
        if(chainCheck.check(FIO))
            System.out.println("You have successfully logged in!");
        else
            System.out.println("Login failed");
    }

    /**
     * Метод создания новой группы
     *
     * @param name наименование новой группы
     * @return объект новой группы
     */
    public Group createGroup(String name) {
        return new Group(name, this.filter);
    }

}
