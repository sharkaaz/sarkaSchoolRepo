import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class middle_lines {
    public static void drawImage(Graphics graphics) {
        int middleX = WIDTH / 2;
        int middleY = HEIGHT / 2;


        graphics.setColor(Color.RED);
        graphics.drawLine(0, middleY, WIDTH, middleY);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(middleX, 0, middleX, HEIGHT);



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
