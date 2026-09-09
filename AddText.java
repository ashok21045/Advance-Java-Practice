import javax.swing.*;
import java.awt.FlowLayout;
public class AddText {
    public static void main(String [] args){
        JFrame frame = new JFrame("my  first program");
        frame.setLayout(new FlowLayout());
        JLabel Name = new JLabel("Name:Ram");
        JLabel Age = new JLabel("Age:20");
        JLabel Gender = new JLabel("Gender:Male");
        frame.add(Name);
        frame.add(Age);
        frame.add(Gender);

        Name.setSize(100,20);
        Age.setSize(100,20);
        Gender.setSize(100,20);

        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
