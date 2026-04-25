import javax.swing.*;
import java.awt.event.*;

class FocusClass{
    JLabel text;
    FocusClass(){
         JFrame frame = new JFrame("Mouse event");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        text = new JLabel("Programming is fun");
        text.setBounds(10, 10, 200, 50);
        FocusEvents myEvent = new FocusEvents();
        frame.addKeyListener(myEvent);
        frame.add(text);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    class FocusEvents implements FocusListener{
        
    }

}

public class TestFocusListener {
    
}
