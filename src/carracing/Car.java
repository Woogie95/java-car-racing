package carracing;

public class Car {

    private final String carName;
    private final int position;

    public Car(String carName, int position) {
        this.carName = carName;
        this.position = position;
    }

    public Car addPosition() {
        return new Car(this.carName, this.position + 1);
    }

    public String getCarName() {
        return carName;
    }

    public int getPosition() {
        return position;
    }

}
