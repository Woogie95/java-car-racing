package carracing;

public class RacingRepeatCount {

    private final int repeatCount;

    public RacingRepeatCount(String repeatCount) {
        this.repeatCount = validateRepeatCountType(repeatCount);
    }

    public int validateRepeatCountType(String repeatCount) {
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
