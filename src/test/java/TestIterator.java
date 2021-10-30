import iterator.Iterator;
import org.junit.jupiter.api.Test;
import systemClasses.SystemManager;

import static org.junit.jupiter.api.Assertions.*;

public class TestIterator {

    static int USER_COUNT = 5;

    @Test
    void testIterator() {
        System.out.println("-----------ITERATOR TEST-----------");
        SystemManager systemManager = new SystemManager();
        for (int i = 0; i < USER_COUNT; i++)
            systemManager.newUserRegistration("User" + (i + 1), i + "." + i + ".2021");
        Iterator<?> iterator = systemManager.createIterator();
        int iterUsersCount = 0;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterUsersCount++;
        }
        assertEquals(USER_COUNT, iterUsersCount);
        assertThrows(ArrayIndexOutOfBoundsException.class, iterator::next);
        System.out.println("-----------------------------------");
    }

}
