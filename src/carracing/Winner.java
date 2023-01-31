package carracing;

import java.util.List;

public class Winner {

    private final List<String> winnerNames;

    public Winner(List<String> winnerNames) {
        this.winnerNames = winnerNames;
    }

    // 위너에서 가지고 있어야 할 기능이 뭐가 있을까??
     // 우승자 이름 찾기??


    public List<String> getWinnerNames() {
        return winnerNames;
    }

}
