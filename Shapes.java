import javax.swing.*;
import java.awt.*;

public class Shapes extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Rectangle
        g.setColor(Color.RED);
        g.drawRect(50, 50, 150, 100);

        // Circle
        g.drawOval(250, 50, 100, 100);

        // Line
        g.drawLine(50, 200, 350, 200);

        // Oval
        g.drawOval(50, 250, 150, 80);

        // Filled rectangle
        g.setColor(Color.RED);
        g.fillRect(250, 250, 100, 50);

       
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Shapes");

        Shapes panel = new Shapes();
        frame.add(panel);
        panel.setBackground(Color.YELLOW);


        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}