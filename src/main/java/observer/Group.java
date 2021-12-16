package observer;

import systemClasses.filters.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс группы в социальной сети. Является классом-издателем.
 */
public class Group {

    /**
     * Имя группы
     */
    public String name;

    /**
     * Список подписчиков группы
     */
    public final List<Subscriber> subscribers;

    /**
     * Список с записями группы
     */
    public List<String> posts;

    /**
     * В конструктор передаем текущий системный фильтр, который добавляем в подписчики
     *
     * @param name   имя группы
     * @param filter текущий системный фильтр
     */
    public Group(String name, Filter filter) {
        this.name = name;
        this.subscribers = new ArrayList<>();
        this.subscribers.add(filter);
        this.posts = new ArrayList<>();
        System.out.println("Group with name \"" + this.name + "\" has been created");
    }

    /**
     * Процедура добавления подписчика
     *
     * @param subscriber новый подписчик
     */
    public void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
        System.out.println(subscriber.getClass().getName() +
                " has been subscribed to the group with name \"" + this.name + "\"");
    }

    /**
     * Процедура удаления подписчика
     *
     * @param subscriber отписавшийся объект
     */
    public void unsubscribe(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
        System.out.println(subscriber.getClass().getSimpleName() + " has been unsubscribed");
    }

    /**
     * Процедура оповещения подписчиков о добавлении новой записи группы
     */
    private void notifySubscribers() {
        for (Subscriber subscriber : this.subscribers)
            subscriber.react(this);
        System.out.println("\nGroup \"" + this.name + "\" has been notified all subscribers\n");
    }

    /**
     * Процедура добавления новой записи в группу
     *
     * @param post новая запись
     */
    public void addNewPost(String post) {
        this.posts.add(post);
        System.out.println("\nGroup \"" + this.name + "\" has been added a new post!\n");
        this.notifySubscribers();
    }

}
