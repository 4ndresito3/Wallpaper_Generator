import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferStrategy;

public class Window {
    private Frame window;
    private Canvas canvas;
    private BufferStrategy bf;

    public Window(int x, int y) {
        window = new Frame("Wallpaper generator");

        window.setLayout(new FlowLayout());
        window.setSize(x,y);
        window.setVisible(true);

        canvas = new Canvas();
        window.add(canvas);
        canvas.createBufferStrategy(2);
        bf = canvas.getBufferStrategy();

        window.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void loopDraw(){
        while (true) {
            Graphics g = bf.getDrawGraphics();

            g.setColor(Color.BLACK);
            g.fillRect(50, 50, 200, 200);

            g.dispose();
            
            bf.show();
        }
    }
}