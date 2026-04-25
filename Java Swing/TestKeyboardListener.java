import javax.swing.*;
import java.awt.event.*;


class KeyClass{
    JLabel text;
    KeyClass(){
        JFrame frame = new JFrame("Mouse event");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        text = new JLabel("Programming is fun");
        text.setBounds(10, 10, 200, 50);
        KeyEvents myEvent = new KeyEvents();
        frame.addKeyListener(myEvent);
        frame.add(text);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    class KeyEvents implements KeyListener{
        public void keyPressed(KeyEvent ke){
            System.out.println("Key Pressed");
            int key = ke.getKeyCode();
            switch (key) {
                case KeyEvent.VK_DOWN:
                    text.setBounds(text.getX(), text.getY() + 10, 200, 50);
                    break;
                case KeyEvent.VK_UP:
                    text.setBounds(text.getX(), text.getY()-10, 200, 50);
                    break;
                case KeyEvent.VK_LEFT:
                    text.setBounds(text.getX()-10, text.getY(), 200, 50);
                    break;
                case KeyEvent.VK_RIGHT:
                    text.setBounds(text.getX()+10, text.getY(), 200, 50);
                    break;        
                default:
                    System.out.println("Invalid key");
            }
        }

        public void keyTyped(KeyEvent Ke){
            System.out.println("Key Typed");
        }

        public void keyReleased(KeyEvent Ke){
            System.out.println("Key Released ");
        }
    }
}


public class TestKeyboardListener {
    public static void main(String[] args) {
        new KeyClass();
    }
}
