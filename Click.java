import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;


public class Click extends JFrame implements ActionListener{
    JButton b1;
    public void myJFrame()
    {
        b1 =new JButton("Click Me");
        add(b1);
        b1.addActionListener(this);

        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args){
        Click c = new Click();
        c.myJFrame();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Clicked");

    }

}
