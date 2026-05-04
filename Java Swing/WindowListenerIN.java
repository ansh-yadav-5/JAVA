import java.awt.event.WindowEvent;
import  javax.swing.*;



class WindowInterface{
    WindowInterface(){
        JFrame f = new JFrame("Window Interface");
        f.setSize(400, 400);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        AEvent myEv = new AEvent();
        f.addWindowListener(myEv);

        f.setVisible(true);
        f.setLayout(null);
    }

    class AEvent implements java.awt.event.WindowListener{

        public void windowActivated(WindowEvent we){
            System.out.println("Window Activated");
        } 
        public void windowClosed(WindowEvent we){
            System.out.println("Window Closed");
        } 
        public void windowClosing(WindowEvent we){
            System.out.println("Window Closing");
        } 
        public void windowDeactivated(WindowEvent we){
            System.out.println("Window Deactivated");
        } 
        public void windowDeiconified(WindowEvent we){
            System.out.println("Window Deiconified");
        } 
        public void windowIconified(WindowEvent we){
            System.out.println("Window Iconified");
        }
        public void windowOpened(WindowEvent we){
            System.out.println("Window Opened");
}
}
}





public class WindowListenerIN {
    public static void main(String[] args) {
        new WindowInterface();
    }
}
