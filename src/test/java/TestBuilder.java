import builder.MessageDirector;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import systemClasses.Message;
import systemClasses.User;
import systemClasses.messageContent.MessageContent;
import systemClasses.messageContent.Photo;
import systemClasses.messageContent.Text;
import systemClasses.messageContent.Video;

import java.util.Arrays;

public class TestBuilder {

    private static User user1, user2, user3;
    private static Text text;
    private static MessageContent photo, video;

    /**
     * Инициализация пользователей и содержимого сообщения
     */
    @BeforeAll
    static void initData() {
        user1 = new User("User1", "01.01.2021");
        user2 = new User("User2", "02.03.2021");
        user3 = new User("User3", "03.03.2021");
        text = new Text("Hello, users!");
        photo = new Photo(123456);
        video = new Video(155115);
    }

    @Test
    void testBuilder() {
        System.out.println("-----------BUILDER TEST-----------");
        MessageDirector director = new MessageDirector();
        Message emptyMessage = director.createEmptyMessage(user1, Arrays.asList(user2, user3));
        System.out.println("Empty message created by director:");
        System.out.println(emptyMessage);

        Message messageWithText = director.createTextMessage(user1, Arrays.asList(user2, user3), text);
        System.out.println("Message with text created by director:");
        System.out.println(messageWithText);

        Message messageWithContent = Message.builder()
                .sender(user1)
                .recipientList(Arrays.asList(user2, user3))
                .contentList(Arrays.asList(text, photo, video))
                .build();
        System.out.println("Message with content created by Message.builder():");
        System.out.println(messageWithContent);

        System.out.println("----------------------------------");
    }

}
