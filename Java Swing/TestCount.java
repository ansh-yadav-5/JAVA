import javax.swing.*;
import java.awt.event.*;



public class TestCount implements ActionListener {
    JLabel l1, l2;
    JTextArea area;
    JButton b;

    TestCount(){
        JFrame frame = new JFrame();
        l1 = new JLabel();
        l1.setBounds(50, 20, 100, 30);
        frame.add(l1);

        l2 = new JLabel();
        l2.setBounds(160, 20, 100, 30);
        frame.add(l2);

        area = new JTextArea();
        area.setLineWrap(true);
        area.setBounds(20, 75, 250, 200);
        frame.add(area);

        b = new JButton(" count ");
        b.setBounds(100, 300, 120, 30);
        frame.add(b);
        b.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(null);
        frame.setSize(450,450);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String text = area.getText();
        String[] words = text.split("\\s");
        l1.setText("Words: " + words.length);
        l2.setText("Character: " + text.length());
    }

    public static void main(String[] args) {
        new TestCount();        
    }
}
