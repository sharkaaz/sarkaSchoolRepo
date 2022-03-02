import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class OdStenyKeStene {

    public static void drawImage(Graphics graphics) {
        int startx = 0;
        int starty = 0;

        for (int i = 0; i < 21; i++) {

            ruznyCary(startx, starty, graphics);
            starty = (starty + 20);
            startx = (startx + 20);
        }



    }

    public static void ruznyCary(int startx, int starty, Graphics graphics) {
        graphics.setColor(Color.GREEN);
        graphics.drawLine(0, starty, startx, HEIGHT);
        graphics.setColor(new Color(0xAC00DE));
        graphics.drawLine(startx, 0, WIDTH, starty);
    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);
        }
    }
}

