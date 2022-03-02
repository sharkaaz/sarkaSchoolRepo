import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRects {

    public static void drawImage(Graphics graphics){

        //first Rectangular
graphics.setColor(Color.RED);
        graphics.drawRect(10,15,25,25);

        //second Rectangular
        graphics.setColor(Color.BLUE);
graphics.drawLine(50,50,65,50);
        graphics.drawLine(65,50,65,75);
        graphics.drawLine(65,75,50,75);
        graphics.drawLine(50,75,50,50);

        //third Rectangular
        int [] positionx = {175,175,225,225};
        int [] positiony = {200,280,280,200};

        graphics.setColor(Color.DARK_GRAY);
graphics.fillPolygon(positionx,positiony, positionx.length);


        //fourth Rectangular
        graphics.setColor(Color.green);
        graphics.fillRect(45,150,25,65);

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
