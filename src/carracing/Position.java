package carracing;

public class Position {

    private final int position;

    public Position(int position) {
        this.position = position;
    }

    public Position movable() {
        return new Position(this.position + 1);
    }

    public int getPosition() {
        return position;
    }

}
