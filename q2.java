import javax.swing.*;
import java.awt.*;
// public class q2{
//     public static void main(String[] args) {
//         JFrame frame = new JFrame("my  first program");

//         ImageIcon image = new ImageIcon("a.png");
//         JLabel img = new JLabel(image);
//         frame.add(img);



//         frame.setSize(500,300);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setVisible(true);
//     }
    
// }

public class q2 extends JLabel{
    Image image;
    public q2(){
        image = new ImageIcon("a.png").getImage();
        
    }
     @Override 
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image, 50, 50, 60,60 ,this);

    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("my  first program");

        Label name = new Label("Name");

        frame.add(name);

        frame.add(new q2());

        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}