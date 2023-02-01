package carracing;

import java.util.List;

public class Winner {

    private static final int WINNER_MIN_PERSONNEL = 1;

    private final List<String> winners;

    public Winner(List<String> winners) {
        this.winners = validate(winners);
    }

    public List<String> validate(List<String> winners) {
        validateMinWinners(winners);
        return winners;
    }

    private void validateMinWinners(List<String> winners) {
        if (winners.size() < WINNER_MIN_PERSONNEL) {
            throw new IllegalArgumentException("우승자는 한명 이상이여야 합니다.");
        }
    }

    public List<String> getWinners() {
        return winners;
    }

}
