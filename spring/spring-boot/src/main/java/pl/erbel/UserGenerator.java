package pl.erbel;

import org.apache.commons.text.RandomStringGenerator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

public class UserGenerator {

    public static final int USERS_NUMBER = 5;
    private static final int NAME_LENGTH = 8;
    private static final char[] RANGE = {'a', 'z'};

    public static List<User> generateUsers() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < USERS_NUMBER; i++) {
            User randomUser = createRandomUser();
            users.add(randomUser);
        }
        return users;
    }

    private static User createRandomUser() {
        User user = new User();
        user.setFirstName(randomAlphabetic(NAME_LENGTH));
        user.setLastName(randomAlphabetic(NAME_LENGTH));
        user.setPassword(randomAlphabetic(NAME_LENGTH));
        user.setLogin(randomAlphabetic(NAME_LENGTH));
        user.setBirthDate(new Date());
        return user;
    }

    public static String generate(int length) {

        return new RandomStringGenerator.
                Builder().
                withinRange(RANGE).
                build().
                generate(length);


    }
}
