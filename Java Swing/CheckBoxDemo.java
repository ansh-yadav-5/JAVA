import java.awt.event.*;
import javax.swing.*;

public class CheckBoxDemo implements ActionListener {
    JCheckBox cb1,cb2;
    CheckBoxDemo(){
        JFrame frame = new JFrame("CheckBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cb1 = new JCheckBox("C++");
        cb2 = new JCheckBox("Java");

        cb1.addActionListener( this);
        cb1.setBounds(50, 50, 100, 30);
        cb2.addActionListener(this);
        cb2.setBounds(50, 100, 100, 30);

        

        frame.setLayout(null);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.add(cb1);
        frame.add(cb2);
    }


    public void actionPerformed(ActionEvent e){
        String S1,S2;
        if (cb1.isSelected()) {
           S1 = "C++";
           System.out.println(S1 + " is selected "); 
        }
        if (cb2.isSelected()) {
            S2 = "Java";
            System.out.println(S2 + " is selected ");
        }
    }

    public static void main(String[] args) {
        new CheckBoxDemo();
    }
    
}
