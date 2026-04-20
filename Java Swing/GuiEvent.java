import javax.swing.*;
import java.awt.event.*;


public class GuiEvent implements ActionListener{
    JButton button;
    public static void main(String[] args) {
        GuiEvent gui = new GuiEvent();
        gui.go();
    }
    public void go(){
        JFrame frame = new JFrame("Event ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new JButton("Click me ");
        button.setBounds(50, 50, 200, 30);
        frame.add(button);
        frame.setLayout(null);
        button.addActionListener(this);
        frame.setSize(400,300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
        button.setText("I've been clicked!");
    }
}
