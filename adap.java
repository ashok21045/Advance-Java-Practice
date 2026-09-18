import java.awt.*;
import java.awt.event.*;

class adap extends Frame {
    TextField textField;
    public adap(){
        textField = new TextField();
        add(textField);
        setSize(300,300);
        setTitle("Adapter Class Example");
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("Window Closing");
                System.exit(0);
            }
        });

       addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked at: " + e.getX() + ", " + e.getY());
            }
        });

        textField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                System.out.println("Key Typed: " + e.getKeyChar());
            }
        });
    }

    public static void main(String[] args) {
        new adap();

    }
}