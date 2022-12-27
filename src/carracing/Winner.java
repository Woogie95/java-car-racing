package carracing;

import java.util.List;

public class Winner {

    private final List<String> winnersName;

    public Winner(List<String> winnersName) {
        this.winnersName = winnersName;
    }

    public List<String> getWinnersName() {
        return winnersName;
    }

}
