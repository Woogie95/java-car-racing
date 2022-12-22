package carracing;

import java.util.List;

public class Cars {

    private final List<CarFactory> cars;

    public Cars(List<CarFactory> cars) {
        this.cars = cars;
    }

    public List<CarFactory> getCars() {
        return cars;
    }

}
