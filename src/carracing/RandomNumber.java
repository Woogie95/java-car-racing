package carracing;

import java.util.Random;

public class RandomNumber {

    private static final int MAX_RANDOM_NUMBER = 10;

    private static final Random RANDOM = new Random();

    public static int createRandomNumber() {
        return RANDOM.nextInt(MAX_RANDOM_NUMBER);
    }

}
