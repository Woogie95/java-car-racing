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

    public Car(String carName) { // 이름만 받는 생성자를 만들어서 구현해도 문제가 없는가??
        this.carName = carName; // 이렇게 해버린 이유 : divideCarNameByComma() 메소드가 CarFactory 클래스에 에 있었으나
        this.position = INITIAL_POSITION; // 검증을 하면서 거기에 있을 필요성을 못느껴서 Car 클래스에 기능을 옮기면면서 만든 생성자 이다.
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

    public int isMaxPosition(int position) {
        return Math.max(this.position, position);
    }

    public boolean isMaxPositionEquals(int position) {
        return this.position == position;
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
