package chainOfResponsibility;

import java.util.Random;
import java.util.Scanner;

/**
 * Элемент цепи, проверяющий двухфакторную аутентификацию
 *
 * @see BaseCheck
 */
public class TwoFactorAuthCheck extends BaseCheck {

    private final int ATTEMPTS_COUNT = 3;
    private final int CODE_LENGTH = 6;

    @Override
    public boolean check(String FIO) {
        for (int i = 0; i < ATTEMPTS_COUNT; i++) {
            String generatedCode = generateCode();
            System.out.println("Two factor auth code: " + generatedCode);
            if (generatedCode.length() == CODE_LENGTH)
                return checkNext(FIO);
            System.out.println("Wrong code!");
        }
        System.out.println("You don't have more attempts!");
        return false;
    }

    /**
     * Метод генерации кода двухфакторной аутентификации
     *
     * @return сгенерированный код
     */
    private String generateCode() {
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        return String.format("%06d", number);
    }

}
