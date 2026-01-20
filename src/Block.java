import java.awt.*;
import javax.swing.ImageIcon;

public class Block {
    private final int MAX_BLOCKS_X = 40;
    private final int MAX_BLOCKS_Y = 20;
    private Color color;
    private int blockWidth;
    private int blockHeight;
    public ImageIcon texture;

    public Block(int screenWidth, int screenHeight, Color color) {
        this.blockWidth = screenWidth / MAX_BLOCKS_X;
        this.blockHeight = screenHeight / MAX_BLOCKS_Y;
        this.color = color;
        this.texture = new ImageIcon("resources/default.png");
    }

    public Block(int screenWidth, int screenHeight){
        this(screenWidth, screenHeight, Color.RED);
    }
    public int getBlockWidth() {
        return blockWidth;
    }
    public int getBlockHeight() {
        return blockHeight;
    }
    public Color getColor(){
        return color;
    }

    public void setBlockWidth(int blockWidth){
        this.blockWidth = blockWidth;
    }
    public void setBlockHeight(int blockHeight){
        this.blockHeight = blockHeight;
    }
    public void setColor(Color color){
        this.color = color;
    }
}