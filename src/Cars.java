import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public static List<Car> findWinner(List<Car> cars) { // 우승자 찾기
        List<Car> winners = new ArrayList<>();
        int maxPositionCount = cars.get(0).getPosition();
        for (Car car : cars) {
            maxPositionCount = findMaxPositionCount(car, maxPositionCount);
        }

    }

    public static int findMaxPositionCount(Car car, int maxPositionCount) { // 최대 포지션 찾기
        return Math.max(car.getPosition(), maxPositionCount);
    }

    public static void findSamePositionCount(List<Car> cars) { // 값은 값 찾기
        for (Car car : cars) {
            if (){

            }
        }

    }

    public List<Car> getCars() {
        return cars;
    }

}
