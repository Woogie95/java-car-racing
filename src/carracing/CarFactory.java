package carracing;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    public static final int INITIAL_POSITION = 0;

    private static final String SPLIT_CAR_NAME_BY_COMMA = ",";

    public static List<String> divideCarNameByComma(String carName) {
        return List.of(carName.split(SPLIT_CAR_NAME_BY_COMMA));
    }

    public static Cars createCars(List<String> carNames) {
        List<Car> cars = new ArrayList<>();
        for (String name : carNames) {
            cars.add(new Car(name, new Position(INITIAL_POSITION)));
        }
        return new Cars(cars);
    }

}
