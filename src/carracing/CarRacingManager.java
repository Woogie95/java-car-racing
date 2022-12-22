package carracing;

import java.util.Arrays;

public class CarRacingManager {

    public void startCarRacing() {
        CarName carName = new CarName(Input.inputCarName());
        System.out.println(Arrays.toString(carName.validate(Input.inputCarName())));

    }

}
