import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class motionEvent {
    JLabel text;
    motionEvent(){
        JFrame frame = new JFrame("Mouse Event");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        text = new JLabel("Programming is fun");
        text.setBounds(10, 10, 200, 500);
        mEvent myEvent = new mEvent();
        text.addMouseMotionListener(myEvent);
        frame.add(text);
        frame.setLayout(null);
        frame.setVisible(true);  
    }

    class mEvent implements MouseMotionListener {
        @Override
        public void mouseDragged(MouseEvent me){
            System.out.println("Mouse Dragged");
            System.out.println(me.getX());
            System.out.println(me.getY());
            text.setBounds(me.getX(), me.getY(), 200, 500);
        }

        public void mouseMoved(MouseEvent me){
            System.out.println("Mouse move");
        }
    }
}

public class TestMouseMotionListener {
    public static void main(String[] args) {
        new motionEvent();
    }
}
