package carracing;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    private static final String DIVIDE_BY_COMMA = ",";
    private static final int POSITION_INITIAL_VALUE = 0;

    public static List<String> divideInputCarNames(String tempCarName) {
        return List.of(tempCarName.split(DIVIDE_BY_COMMA));
    }

    public static Cars createCars(List<String> tempCarNames) {
        List<Car> cars = new ArrayList<>();
        for (String carName : tempCarNames) {
            cars.add(new Car(carName, POSITION_INITIAL_VALUE));
        }
        return new Cars(cars);
    }

}
