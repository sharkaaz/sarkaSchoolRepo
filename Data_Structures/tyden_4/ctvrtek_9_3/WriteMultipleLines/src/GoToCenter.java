import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {


    public static void drawImage(Graphics graphics) {
        int startx = 10;
        int starty = 10;

        for (int i = 0; i < 3; i++) {

            myThreeLines(startx, starty, graphics);
            startx = (startx + 15);

        }


    }
    // Create a function that takes 3 parameters and draws a single line
    // Parameters: the x and y coordinates of the line's starting point and the graphics
    // The function shall draw a line from that point to the center of the canvas
    // Draw at least 3 lines with that function using a loop
}

    public static void myThreeLines(int startx, int starty, Graphics graphics) {


        graphics.drawLine(startx, starty, WIDTH / 2, HEIGHT / 2);


    }

}

// Don't touch the code below
static int WIDTH=320;
static int HEIGHT=320;

public static void main(String[]args){
        JFrame jFrame=new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel=new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH,HEIGHT));
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