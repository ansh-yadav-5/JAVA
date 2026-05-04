import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseInterface{
    JButton btn;
    MouseInterface(){
        JFrame f = new JFrame("Mouse Interface");
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn = new JButton("Click me");
        btn.setBounds(100, 100, 100, 100);
        f.add(btn);

        mEvent myEvent = new mEvent();
        btn.addMouseListener(myEvent);


        f.setLayout(null);
        f.setVisible(true);
        // btn.setBackground(Color.BLUE);
        
    }
    class mEvent implements MouseListener{

     public void mouseClicked(MouseEvent me){
        System.out.println("Mouse Clicked");
     }   

      public void mouseEntered(MouseEvent me){
        System.out.println("Mouse Entered");
        
        btn.setBackground(Color.BLUE);
        
    }
    
     public void mouseExited(MouseEvent me){
        System.out.println("Mouse Exited");
    }
    
    public void mousePressed(MouseEvent me){
            System.out.println("Mouse Pressed");
        }
        
       public  void mouseReleased(MouseEvent me){
            System.out.println("Mouse Released");
        }
    }
}




public class MouseListenerInterface{
    public static void main(String[] args) {
        new MouseInterface();
    }
}