import java.awt.Graphics;
import java.util.ArrayList;

public class BlocksManager {
    
    private final int PIXELS = 36;
    private int width;
    private int height;
    private ArrayList<Shapes> shapesList;

    public BlocksManager(int width , int height) {
        this.width = width;
        this.height = height;
    }

    //this method will generate the random shapes
    private void generateShapes() {

    }

    public void drawBlocks(Graphics g,Block block) {
        for(int i = 0; i < width ; i++){
            for(int j = 0; j < height ; j++){
                g.drawImage(block.texture.getImage(),i * PIXELS ,j * PIXELS, null);
            }
        }
    }
}
