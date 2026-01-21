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


    //we are just interested in the starting position?? Im not sure 
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Segment segment = (Segment) o;
        return startX == segment.startX &&
                startY == segment.startY;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(startX, startY, size, dir);
    }
}
