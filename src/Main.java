import java.math.*;
import java.util.Random;
import java.awt.Toolkit;


public class Main {

    private static Window w;

    public static void main(String[] args) {
        System.out.println("Aplicacion Encendida");
        int[] res = getResolution();
        System.out.println("Resolucion: " + res[0] + "x" + res[1]);
        w = new Window(res[0],res[1]);

    }

    private static int[] getResolution(){
        Toolkit t = Toolkit.getDefaultToolkit();
        return new int[]{t.getScreenSize().width, t.getScreenSize().height};
    }
}