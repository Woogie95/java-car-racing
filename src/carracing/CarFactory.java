package carracing;

public class CarFactory {

    private final CarName carName;
    private final Position position;

    public CarFactory(CarName carName, Position position) {
        this.carName = carName;
        this.position = position;
    }







    public CarName getCarName() {
        return carName;
    }

    public Position getPosition() {
        return position;
    }
}
