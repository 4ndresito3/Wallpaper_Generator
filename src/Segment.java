public class Segment {
    
    private int startX;
    private int startY;
    private int size;
    private Direction dir;

    public Segment(int x, int y, int size, Direction d) {
        this.startX = x;
        this.startY = y;
        this.size = size;
        this.dir = d;
    }

    public int getStartX() {
        return startX;
    }

    public int getStartY() {
        return startY;
    }

    public int getSize() {
        return size;
    }

    public Direction getDirection() {
        return dir;
    }
}
