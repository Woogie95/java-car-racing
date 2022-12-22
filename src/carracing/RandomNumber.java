package carracing;

import java.util.Random;

public class RandomNumber {

    private static final int MAX_RANDOM_NUMBER_VALUE = 10;

    private static final Random random = new Random();

    public static int createRandomNumber() {
        return random.nextInt(MAX_RANDOM_NUMBER_VALUE);
    }

}
