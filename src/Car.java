public class Car {

    private static final int POSITION_INITIAL_VALUE = 0;

    private final String carName; // 이름 받으면 됨
    private final int position; // 랜덤 숫자를 확인해서 받아야 함

    public Car(String carName, int position) {
        this.carName = checkPositionMove().carName;
        this.position = checkPositionMove().position;
    }

    public void validate() {

    }

    private Car checkPositionMove() {
        if (RandomNumber.createRandomNumber() >= 4) {
            return new Car(this.carName, this.position + 1);
        }
        return new Car(this.carName, this.position);
    }

    public String getCarName() {
        return carName;
    }

    public int getPosition() {
        return position;
    }
}
