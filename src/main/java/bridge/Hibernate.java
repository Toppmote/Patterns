package bridge;

/**
 * Класс, реализующий фреймворк Hibernate
 */
public class Hibernate implements Framework {

    @Override
    public void operation() {
        System.out.println("Hibernate framework perform operation");
    }
}
