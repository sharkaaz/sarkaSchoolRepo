import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void drawImage(Graphics graphics) {

       int size = 250;
Color [] color = {Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,Color.BLUE,(new Color(0,153,255)),(new Color(238,130,238))};

        for (int i = 0; i < color.length; i++) {
           graphics.setColor(color[i]);

            for (int j = 0; j < 7; j++) {

                size -= 5;
                rainbowBox(size,color[i],graphics);
            }
        }
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).
    }

    public static void rainbowBox(int size, Color color,Graphics graphics ){

        graphics.fillRect(WIDTH/2-size/2,HEIGHT/2-size/2,size,size);
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