import javax.swing.*;
import java.awt.*;
public class q1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("my  first program");
        frame.setSize(500,300);

        Label name = new Label("Name");
        name.setBounds(20, 50, 100, 30);
        frame.add(name);

        TextField name1 = new TextField();
        name1.setBounds(150, 50, 100, 30);
        frame.add(name1);

          
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
