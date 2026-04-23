import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBox implements ActionListener{
    JComboBox cb;
    ComboBox(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String Country[] = {"India" , "USA" , "England", "NewZealand"};
        cb = new JComboBox(Country);
        cb.setBounds(50,50,190,20);
        cb.setSelectedIndex(-1);
        cb.addActionListener(this); 

        frame.add(cb);

        frame.setLayout(null);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == cb) {
            System.out.println(cb.getSelectedItem());
        }
    }

    public static void main(String[] args) {
        new ComboBox();
    }
}
