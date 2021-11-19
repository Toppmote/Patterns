package chainOfResponsibility;

/**
 * Абстрактный класс проверки пользователя при входе в соц. сеть
 */
public abstract class BaseCheck {

    protected BaseCheck nextCheck;

    /**
     * Метод проверки, реализуемый конкретными классами
     *
     * @return результат проверки
     */
    public abstract boolean check(String FIO);

    /**
     * Метод запуска проверке в следующем объекте цепочки. Если объект последний, то завершаем проверку.
     *
     * @param FIO ФИО пользователя
     * @return результат проверки
     */
    protected boolean checkNext(String FIO) {
        if (nextCheck == null)
            return true;
        return nextCheck.check(FIO);
    }

    /**
     * Метод соединения текущего объекта проверки со следующим. Позволяет строить любую цепочку обязанностей
     *
     * @param nextCheck следующий объект проверки
     * @return следующий объект проверки
     */
    public BaseCheck connectTo(BaseCheck nextCheck) {
        this.nextCheck = nextCheck;
        return nextCheck;
    }

}
