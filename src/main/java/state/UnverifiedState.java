package state;

import systemClasses.User;

/**
 * Состояние неподтвержденого пользователя
 *
 * @see UserState
 */
public class UnverifiedState extends UserState {

    public UnverifiedState(User user) {
        super(user);
    }

    @Override
    public void onLoggingIn() {
        System.out.println("Hello, " + user.getFIO() + ", please, verify your account.");
    }
}
