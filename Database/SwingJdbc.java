import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingJdbc {
     public static void main(String[] args) {
        JFrame frame = new JFrame("Jdbc");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lbl1 = new JLabel(" StudentId : ");
        JLabel lbl2 = new JLabel(" Sname : ");
        JLabel lbl3 = new JLabel(" Course : ");
        JLabel lbl4 = new JLabel(" MobNo : "); 
        JButton btn = new JButton("Submit  ");

        JTextField tf1,tf2,tf3,tf4;
        tf1 = new JTextField("  ");
        tf1.setBounds(100,50,200,30);
        frame.add(tf1);
        tf2 = new JTextField(" ");
        tf2.setBounds(100, 100, 200, 30);
        frame.add(tf2);
        tf3 = new JTextField(" ");
        tf3.setBounds(100, 150, 200, 30);
        frame.add(tf3);
        tf4 = new JTextField(" ");
        tf4.setBounds(100, 200, 200, 30);
        frame.add(tf4);

        btn.setBounds(100, 500, 100, 30);
        lbl1.setBounds(10,50,80,30);
        lbl2.setBounds(10, 100, 80, 30);
        lbl3.setBounds(10, 150, 80, 30);
        lbl4.setBounds(10, 200, 80, 30);
        frame.add(btn);
        frame.add(lbl1);
        frame.add(lbl2);
        frame.add(lbl3);
        frame.add(lbl4);

        frame.setSize(300,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
