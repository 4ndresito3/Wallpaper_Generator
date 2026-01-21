
import java.util.HashSet;
import java.util.Set;

public class Shapes {
    
    Set<Segment> segments;

    public Shapes(Segment s) {
        segments = new HashSet<>();
        segments.add(s);
    }

    public Shapes(HashSet<Segment> segments) {
        this.segments = segments;
    }
}
