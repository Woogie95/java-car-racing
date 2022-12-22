package carracing;

import java.util.Arrays;

public class CarName {

    private final String carName;

    public CarName(String carName) {
        this.carName = Arrays.toString(validate(carName));
    }

    public String[] validate(String carName) {
        return divideCarName(carName);
    }

    public String[] divideCarName(String carName) {
        return carName.split(",");
    }

    public String getCarName() {
        return carName;
    }

}
