import memento.Memento;
import memento.UserHistory;
import memento.UserSnapshot;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import systemClasses.Message;
import systemClasses.User;
import systemClasses.messageContent.Text;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestMemento {

    static User user1, user2, user3;

    @BeforeAll
    static void initUser() {
        user1 = new User("User1", "01.01.2021");
        user2 = new User("User2", "02.03.2021");
        user3 = new User("User3", "03.03.2021");
        new Message(user1, Arrays.asList(user2, user3), new Text("Hello, users!"));
        user1.addFriend(user2);
        user1.sendMessage(new Message(user1, Arrays.asList(user2, user3), new Text("Hello, users!")));
    }

    @Test
    void testMemento() {
        System.out.println("-----------MEMENTO TEST-----------");
        UserHistory userHistory = new UserHistory(user1);
        userHistory.save();

        user1.sendMessage(new Message(user1,
                Collections.singletonList(user3),
                new Text("Hello, dear user3!")));
        user1.setFIO("Cool User1");
        user1.addFriend(user3);
        userHistory.save();

        System.out.println("Snapshots for user with id: " + userHistory.getUser().getId() + "\n");
        List<Memento> userSnapshots = userHistory.getHistory();
        for (Memento snapshot : userSnapshots) {
            System.out.println("Snapshot date: " + snapshot.getDate());
            System.out.println("User FIO: " + snapshot.getFIO());
            System.out.println("User friends: " + snapshot.getFriendsList());
            System.out.println("User messages:\n" + snapshot.getMessagesList());
            System.out.println();
        }

        System.out.println("----------------------------------");
    }

}
