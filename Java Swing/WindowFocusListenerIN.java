
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.*;

class WindowInterfaces{
    WindowInterfaces(){
        JFrame f = new JFrame("Window Interface");
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        WEvent myEv = new WEvent();
        f.addWindowFocusListener(myEv);

        f.setLayout(null);
        f.setVisible(true);

    }
    class WEvent implements WindowFocusListener{

        

        public void windowGainedFocus(WindowEvent we){
            System.out.println("Window Awake");
        } 
    
        public void windowLostFocus(WindowEvent we){
            System.out.println("Window Losses Focus");
        }

       

   
    }
}



public class WindowFocusListenerIN {
    public static void main(String[] args) {
        new WindowInterfaces();
    }
}
