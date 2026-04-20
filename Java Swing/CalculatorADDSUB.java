import javax.swing.*;
import java.awt.event.*;


public class CalculatorADDSUB implements ActionListener{
    JTextField tf1,tf2,tf3;
    JButton b1,b2;
    

    CalculatorADDSUB(){
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lbl = new JLabel(" Calculator ");
        lbl.setBounds(50, 10, 200, 30);
        frame.add(lbl);

        tf1 = new JTextField();
        tf1.setBounds(50,50,150,20);
        frame.add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(50, 100, 150, 20);
        frame.add(tf2);

        tf3 = new JTextField();
        tf3.setEditable(false);
        tf3.setBounds(50, 150, 150, 20);
        frame.add(tf3);

        b1 = new JButton(" + ");
        b1.setBounds(50,200,50,50);
        frame.add(b1);
        b1.addActionListener(this);

        b2 = new JButton(" - ");
        b2.setBounds(120, 200, 50, 50);
        frame.add(b2);
        b2.addActionListener(this);

        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        int a = Integer.parseInt(tf1.getText());
        int b = Integer.parseInt(tf2.getText());
        int c = 0;
        if (e.getSource() == b1) {
            tf3.setText(String.valueOf(a+b));
        } else {
            tf3.setText(String.valueOf(a-b));
        }
    }
    public static void main(String[] args) {
        new CalculatorADDSUB();
    }
}
