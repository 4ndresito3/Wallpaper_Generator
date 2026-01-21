import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Window {
    private final int PIXELS = Settings.PIXELS;
    private int width;
    private int height;
    private Frame window;
    private Canvas canvas;
    private BufferStrategy bf;
    public BlocksManager manager;
    public Block block;
    public boolean saved;

    public Window(int x, int y) {
        window = new Frame("Wallpaper generator");
        height = y;
        width = x;
        // window.setLayout(new FlowLayout());
        window.setSize(x,y);
        window.setVisible(true);

        canvas = new Canvas();
        window.add(canvas);
        canvas.createBufferStrategy(2);
        bf = canvas.getBufferStrategy();

        manager = new BlocksManager(x, y);
        block = new Block(x,y);

        window.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void loopDraw(){
        while (true) {
            Graphics g = bf.getDrawGraphics();
            manager.drawBlocks(g, block);
            saveImage();
            g.dispose();
            bf.show();
        }
    }
    private void saveImage(){
        BufferedImage image = new BufferedImage(canvas.getWidth(), canvas.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        manager.drawBlocks(g, block);
        // g2.dispose();
        try {
            ImageIO.write(image, "png", new File("output/result.png"));
        } catch (Exception e) {
            System.err.println("Skill issue brouski");
        }
    }
}