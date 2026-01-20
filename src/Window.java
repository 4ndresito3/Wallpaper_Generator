import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Window {
    private final int PIXELS = 36;
    private int width;
    private int height;
    private Frame window;
    private Canvas canvas;
    private BufferStrategy bf;
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
            for(int i = 0; i < window.getWidth() ; i++){
                for(int j = 0; j < window.getHeight() ; j++){
                    g.drawImage(block.texture.getImage(),i * PIXELS ,j * PIXELS, null);
                }
            }
            saveImage();
            g.dispose();
            bf.show();
        }
    }
    private void saveImage(){
        BufferedImage image = new BufferedImage(canvas.getWidth(), canvas.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        for(int i = 0; i < window.getWidth() ; i++){
            for(int j = 0; j < window.getHeight() ; j++){
                g.drawImage(block.texture.getImage(),i * PIXELS ,j * PIXELS, null);
            }
        }
        // g2.dispose();
        try {
            ImageIO.write(image, "png", new File("output/result.png"));
        } catch (Exception e) {
            System.err.println("Skill issue brouski");
        }
    }
}