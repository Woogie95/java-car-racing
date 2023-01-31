package carracing;

import java.util.List;

import static carracing.CarFactory.INITIAL_POSITION;

public class Car {


    private static final int ADD_POSITION = 1;
    private static final int CAR_NAME_MAX_LENGTH = 5;
    private static final String CAR_NAME_EMPTY = "";
    private static final String CAR_NAME_CONTAIN_BLANK = " ";
    private static final String SPLIT_CAR_NAME_BY_COMMA = ",";


    private final String carName;
    private final int position;

    public Car(String carName) {
        this.carName = carName;
        this.position = INITIAL_POSITION;
    }

    public Car(String carName, int position) {
        this.carName = validateCarName(carName);
        this.position = position;
    }

    public List<String> divideCarNameByComma() {
        return List.of(this.carName.split(SPLIT_CAR_NAME_BY_COMMA));
    }

    public Car addPosition() {
        return new Car(this.carName, this.position + ADD_POSITION);
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

    public int getPosition() {
        return position;
    }

}
