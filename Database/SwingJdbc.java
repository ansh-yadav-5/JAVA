import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;

public class SwingJdbc  {

    
    JTextField tf1,tf2,tf3,tf4;
    String stuID = tf1.getText();
    String sname = tf2.getText();
    String course = tf3.getText();
    String mobno = tf4.getText();
    

     public SwingJdbc() {
        JFrame frame = new JFrame("Jdbc");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lbl1 = new JLabel(" StudentId : ");
        JLabel lbl2 = new JLabel(" Sname : ");
        JLabel lbl3 = new JLabel(" Course : ");
        JLabel lbl4 = new JLabel(" MobNo : "); 
        JButton btn = new JButton("Submit  ");
        JButton btn2 = new JButton(" Delete ");
        JButton btn3 = new JButton(" Update ");
        
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
        btn2.setBounds(100, 550, 100, 30);
        btn3.setBounds(100,600,100,30);
        lbl1.setBounds(10,50,80,30);
        lbl2.setBounds(10, 100, 80, 30);
        lbl3.setBounds(10, 150, 80, 30);
        lbl4.setBounds(10, 200, 80, 30);
        frame.add(btn);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(lbl1);
        frame.add(lbl2);
        frame.add(lbl3);
        frame.add(lbl4);
        
        frame.setSize(300,400);
        frame.setLayout(null);
        frame.setVisible(true);

        AddHandlerclass handler1 = new AddHandlerclass();
        btn.addActionListener(handler1);
        DeleteHandlerclass handler2 = new DeleteHandlerclass();
        btn2.addActionListener(handler2);
        UpdateHandlerclass handler3 = new UpdateHandlerclass();
        btn3.addActionListener(handler3);
    }

    class AddHandlerclass implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            DBHandler db = new DBHandler();
            db.add(stuID, sname, course, mobno);
        }
    }

    class DeleteHandlerclass implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            DBHandler db = new DBHandler();
            db.deleteRecord(stuID);
        }
    }

    class UpdateHandlerclass implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            DBHandler db = new DBHandler();
            db.updateRecord(stuID, sname, course);
        }
    }

    

    public static void main(String[] args) {
        new SwingJdbc();
        
        
        

    }
}
