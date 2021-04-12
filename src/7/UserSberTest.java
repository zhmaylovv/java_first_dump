package zhmaylo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

class UserSberTest {

    private static Collection<UserSber> collA;
    private static Collection<UserSber> collB;

    @BeforeAll
    static void beforeAll() {
        collA = new ArrayList<>();
        collB = new ArrayList<>();
        for (int i = 0; i < 99_999; i++) {
            collA.add(new UserSber("username" + Math.random(), "email" + Math.random()));
        }
        collA.add(new UserSber("Wally", "find@wally.com"));
        for (int i = 0; i < 99_999; i++) {
            collB.add(new UserSber("username" + Math.random(), "email" + Math.random()));
        }
        collB.add(new UserSber("Wally", "find@wally.com"));
    }

    @Test
    @Timeout(value = 200, unit = TimeUnit.MILLISECONDS)
    void findDuplicates() {
        long startTimer = System.currentTimeMillis();
        List<UserSber> duplicates = UserSber.findDuplicates(collA, collB);
        long duration = System.currentTimeMillis() - startTimer;
        System.out.println("Duration with \"retainAll\": " + duration + " m.s.");
        System.out.println("Found duplicates: " + duplicates.size() + ".");
        for (UserSber d : duplicates) {
            System.out.println(d.getUsername());

        }
    }

    @Test
    @Timeout(value = 200, unit = TimeUnit.MILLISECONDS)
    void findDuplicatesFor() {
        long startTimer = System.currentTimeMillis();
        List<UserSber> duplicates = UserSber.findDuplicatesFor(collA, collB);
        long duration = System.currentTimeMillis() - startTimer;
        System.out.println("Duration with \"for\" : " + duration + " m.s.");
        System.out.println("Found duplicates: " + duplicates.size() + ".");
        for (UserSber d : duplicates) {
            System.out.println(d.getUsername());

        }
    }

    @Test
    @Timeout(value = 200, unit = TimeUnit.MILLISECONDS)
    void findDuplicatesStream() {
        long startTimer = System.currentTimeMillis();
        List<UserSber> duplicates = UserSber.findDuplicatesStream(collA, collB);
        long duration = System.currentTimeMillis() - startTimer;
        System.out.println("Duration with \"stream\" : " + duration + " m.s.");
        System.out.println("Found duplicates: " + duplicates.size() + ".");
        for (UserSber d : duplicates) {
            System.out.println(d.getUsername());

        }
    }
}
