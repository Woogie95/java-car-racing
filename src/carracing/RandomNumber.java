package carracing;

import java.util.Random;

public class RandomNumber {

    private static final int MAX_RANDOM_NUMBER = 10;
    private static final Random RANDOM_NUMBER = new Random();

    public static int createRandomNumber() {
        return RANDOM_NUMBER.nextInt(MAX_RANDOM_NUMBER);
    }

}
