package carracing;

public class Car {

    private static final int ADD_POSITION = 1;
    private static final int CAR_NAME_MAX_LENGTH = 5;
    private static final String CAR_NAME_EMPTY = "";
    private static final String CAR_NAME_CONTAIN_BLANK = " ";

    private final String carName;
    private final Position carPosition;

    public Car(String carName, Position carPosition) {
        this.carName = validateCarName(carName);
        this.carPosition = carPosition;
    }

    public Car addPosition() {
        return new Car(this.carName, this.carPosition.movable());
    }


    public int addMaxPosition(int maxPosition) {
        return Math.max(this.carPosition.getPosition(), maxPosition);
    }

    public boolean isEqualsMaxPosition(int maxPosition) {
        return this.carPosition.getPosition() == maxPosition;
    }

    private String validateCarName(String carName) {
        validateCarNameLength(carName);
        validateCarNameBlank(carName);
        return validateCarNameEmpty(carName);
    }

    private void validateCarNameLength(String carName) {
        if (carName.length() > CAR_NAME_MAX_LENGTH) {
            throw new IllegalArgumentException("자동차 이름의 길이가 5보다 큽니다.");
        }
    }

    private void validateCarNameBlank(String carName) {
        if (carName.contains(CAR_NAME_CONTAIN_BLANK)) {
            throw new IllegalArgumentException("자동차 이름에 공백이 포함되어 있습니다.");
        }
    }

    private String validateCarNameEmpty(String carName) {
        if (carName.equals(CAR_NAME_EMPTY)) {
            throw new IllegalArgumentException("자동차 이름을 입력하지 않았습니다.");
        }
        return carName;
    }

    public String getCarName() {
        return carName;
    }

    public Position getCarPosition() {
        return carPosition;
    }

}
