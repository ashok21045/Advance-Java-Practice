import javax.swing.*;
import java.awt.*;

public class cardLayoutDemo extends JFrame {
    CardLayout cardLayout;
    JPanel cardPanel;

    public cardLayoutDemo() {
       CardLayout card = new CardLayout();
       setLayout(card);

       add(new JButton("Button 1"), "Card 1");
       add(new JButton("Button 2"), "Card 2");

       card.show(getContentPane(), "Card 1");
       setSize(300, 200);
       setVisible(true);
    
    }
    public static void main(String[] args) {
        new cardLayoutDemo();
    }
    
}
