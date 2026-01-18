public class Block {
    // private final int MAX_BLOCKS_X = 40;
    // private final int MAX_BLOCKS_Y = 20;

    private int blockWidth;
    private int blockHeight;

    public Block(int screenWidth, int screenHeight, int maxBlocksX, int maxBlocksY) {
        this.blockWidth = screenWidth / maxBlocksX;
        this.blockHeight = screenHeight / maxBlocksY;
    }
    public int getBlockWidth() {
        return blockWidth;
    }
    public int getBlockHeight() {
        return blockHeight;
    }

    public void setBlockWidth(int blockWidth){
        this.blockWidth = blockWidth;
    }
    public void setBlockHeight(int blockHeight){
        this.blockHeight = blockHeight;
    }
}