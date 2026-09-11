import javax.swing.*;
import java.awt.*;
public class ImageDemo extends JPanel{

    Image image;
    public ImageDemo(){
        image = new ImageIcon("giphy.gif").getImage();
        
    }
    @Override 
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image, 50, 50, 60,60 ,this);
    }

    public static void main(String[] args){
       JFrame frame = new JFrame("Image Demo");
       frame.add(new ImageDemo());

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
