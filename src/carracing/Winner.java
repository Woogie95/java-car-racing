package carracing;

import java.util.List;

public class Winner {

    private final List<String> winnerNames;

    public Winner(List<String> winnerNames) {
        this.winnerNames = winnerNames;
    }

    public List<String> getWinnerNames() {
        return winnerNames;
    }

}
