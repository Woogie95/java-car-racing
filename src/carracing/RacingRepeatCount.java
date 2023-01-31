package carracing;

public class RacingRepeatCount {

    private static final String REPEAT_COUNT_NUMBER_EMPTY = "";
    private static final String REPEAT_COUNT_NUMBER_CONTAIN_BLANK = " ";

    private final int repeatCount;

    public RacingRepeatCount(String repeatCount) {
        this.repeatCount = validate(repeatCount);
    }

    private int validate(String repeatCount) {
        validateBlank(repeatCount);
        validateEmpty(repeatCount);
        return validateRepeatCountType(repeatCount);
    }

    private void validateEmpty(String repeatCount) {
        if (repeatCount.equals(REPEAT_COUNT_NUMBER_EMPTY)) {
            throw new IllegalArgumentException("반복 횟수를 입력하지 않았습니다.");
        }
    }

    private void validateBlank(String repeatCount) {
        if (repeatCount.contains(REPEAT_COUNT_NUMBER_CONTAIN_BLANK)) {
            throw new IllegalArgumentException("공백이 포함되어 있습니다.");
        }
    }

    private int validateRepeatCountType(String repeatCount) {
        int modifyRepeatCountType;
        try {
            modifyRepeatCountType = Integer.parseInt(repeatCount);
        } catch (NumberFormatException msg) {
            throw new NumberFormatException("입력한 값이 숫자가 아닙니다.");
        }
        return modifyRepeatCountType;
    }

    public int getRepeatCount() {
        return repeatCount;
    }

}
