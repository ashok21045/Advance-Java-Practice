import javax.swing.*;
import java.awt.*;

public class fonts extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set font and color
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.setColor(Color.BLUE);
        // Draw text
        g.drawString("Normal String", 50, 100);

        g.setFont(new Font("Serif", Font.PLAIN, 20));
        g.setColor(Color.GREEN);
        g.drawString("this is used for plain text", 50, 150);   


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Fonts");

        fonts panel = new fonts();
        frame.add(panel);
        panel.setBackground(Color.WHITE);

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    
}
