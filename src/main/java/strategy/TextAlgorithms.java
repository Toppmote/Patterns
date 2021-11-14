package strategy;

import systemClasses.FilterResult;
import systemClasses.Message;
import systemClasses.User;

import java.util.Random;

/**
 * Класс, реализующий алгоритм фильтрации текста
 *
 * @see Algorithm
 */
public class TextAlgorithms implements Algorithm {

    @Override
    public FilterResult runAlgorithm(User user, Message message) {
        int max = 100;
        Random random = new Random();
        System.out.println("Second algorithm finished work");
        return new FilterResult(user, message, random.nextInt(max + 1));
    }
}