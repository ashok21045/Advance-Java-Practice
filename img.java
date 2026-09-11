import javax.swing.*;


public class img
{
public static void main(String[] args){
    JFrame frame = new JFrame("Displaying Images");

    ImageIcon image = new ImageIcon("a.png");
    JLabel label = new JLabel(image);

    frame.add(label);
 
    frame.setSize(1500,1000);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);


}
}