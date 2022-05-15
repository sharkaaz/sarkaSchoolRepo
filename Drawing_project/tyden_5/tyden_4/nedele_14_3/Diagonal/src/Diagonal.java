import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonal {
    public static void drawImage(Graphics graphics) {


        int startx = 0;
        int starty = 50;


myDiagonal(startx,starty,graphics);

        }
    public static void myDiagonal(int startx, int starty, Graphics graphics){


        if (( startx  == 0) && (starty ==0)){
            graphics.setColor(Color.GREEN);}
        else
        {
            graphics.setColor(Color.RED);

        }
        graphics.drawLine(startx, starty, WIDTH, HEIGHT);


        // Create a function that draws a single line
        // Use this function to draw the canvas' diagonals
        // If the line starts from the upper-left corner it should be green, otherwise it should be red
        // Make decision about the color in the function


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
