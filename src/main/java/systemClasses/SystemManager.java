package systemClasses;

import lombok.Getter;
import lombok.Setter;
import systemClasses.filters.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс менеджера системы
 */
public class SystemManager {

    /**
     * Список пользователей
     */
    @Getter
    private final List<User> userList;

    /**
     * Фильтр, используемый системой
     */
    @Setter
    @Getter
    private Filter filter;

    public SystemManager() {
        this.userList = new ArrayList<>();
        this.filter = null;
    }

    public void newUserRegistration(String FIO, String regDate) {
        User newUser = new User(FIO, regDate);
        userList.add(newUser);
        System.out.println("New user has been added");
    }

}
