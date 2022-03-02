 import javax.swing.*;

        import java.awt.*;

        import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

    public static void drawImage(Graphics graphics){
int startx = 0;
int starty = 0;

        for (int i = 0; i < 3; i++) {
            drawSquare(startx,starty,graphics);
            startx = (startx + 55);
        }


    }



    public static void drawSquare(int startx, int starty, Graphics graphics) {
        int sizea = 15;
        int sizeb = 55;
        graphics.setColor(Color.CYAN);
graphics.drawRect(startx,starty,sizea,sizeb);
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
