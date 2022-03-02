import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class LinePlayQuarters {

    public static void drawImage(Graphics graphics) {
        int startx = 0;
        int starty = 0;

        for (int i = 0; i < 7; i++) {

            ruznyCary(startx, starty, graphics);
            starty = (starty + 25);
            startx = (startx + 25);
        }



    }

    public static void ruznyCary(int startx, int starty, Graphics graphics) {
        //kvadrant 1
        graphics.setColor(Color.GREEN);
        graphics.drawLine(0, starty, startx, HEIGHT/2);
        graphics.setColor(new Color(0xAC00DE));
        graphics.drawLine(startx, 0, WIDTH/2, starty);
        //kvadrant 2
        graphics.setColor(Color.GREEN);
        graphics.drawLine(WIDTH/2, starty, WIDTH/2 +startx, HEIGHT/2);
        graphics.setColor(new Color(0xAC00DE));
        graphics.drawLine(startx+WIDTH/2, 0, WIDTH, starty);
        //kvadrant 3
        graphics.setColor(Color.GREEN);
        graphics.drawLine(0, HEIGHT/2+starty, startx, HEIGHT);
        graphics.setColor(new Color(0xAC00DE));
        graphics.drawLine(startx, HEIGHT/2, WIDTH/2, HEIGHT/2 + starty);
        //kvadrant 4
        graphics.setColor(Color.GREEN);
        graphics.drawLine(WIDTH/2, HEIGHT/2+starty, WIDTH/2 +startx, HEIGHT);
        graphics.setColor(new Color(0xAC00DE));
        graphics.drawLine(startx+WIDTH/2, HEIGHT/2, WIDTH, HEIGHT/2 + starty);


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

