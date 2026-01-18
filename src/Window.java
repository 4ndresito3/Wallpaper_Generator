import java.awt.*;
import java.awt.event.*;

public class Window {
    private Frame window;

    public Window(int x, int y) {
        window = new Frame("Wallpaper generator");

        window.setLayout(new FlowLayout());
        window.setSize(x,y);
        window.setVisible(true);

        window.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}