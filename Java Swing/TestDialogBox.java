import javax.swing.*;

public class TestDialogBox {
    TestDialogBox(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton btn1 = new JButton("MessageDialog");
        btn1.setBounds(50, 50, 160, 30);
        frame.add(btn1);
        btn1.addActionListener((e) -> {
            JOptionPane.showMessageDialog(frame, "This is error message", "Mymsg",0);
            JOptionPane.showMessageDialog(frame, "This is information message", "Mymsg",1);
            JOptionPane.showMessageDialog(frame, "This is warning message", "Mymsg",2);
            JOptionPane.showMessageDialog(frame, "This is Question message", "Mymsg",3);
            JOptionPane.showMessageDialog(frame, "This is custom message box", "Mymsg",0, new ImageIcon("icon.jpg"));
        });

        JButton btn2 = new JButton("Input Dialog");
        btn2.setBounds(50, 90, 100, 30);
        frame.add(btn2);
        btn2.addActionListener((e) -> {
            // optionType - DEFAULT_OPTION, YES_NO_OPTION, YES_NO_CANCEL_OPTION, OK_CANCEL_OPTION
            // messageType - ERROR_MESSAGE, INFORMATION_MESSAGE, WARNING_MESSAGE, QUESTION_MESSAGE, PLAIN_MESSAGE

            int a = JOptionPane.showOptionDialog(frame, "This is option Dialog", "Mymsg", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, 1);

            System.out.println(a);

            JCheckBox cb = new JCheckBox("Never Show again ");

            Object[] options = {"Yes","No","Cancel", "Try it", cb};

            a = JOptionPane.showOptionDialog(frame, "This is option Dialog ", "Mymsg", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[1]);
        });

        JButton btn3 = new JButton("ConfirmDialog");
        btn3.setBounds(50, 130, 100, 30);
        frame.add(btn3);
        btn3.addActionListener((e) -> {
            int a;
            a = JOptionPane.showConfirmDialog(frame, "This is conformation message ","Sample Message", JOptionPane.DEFAULT_OPTION);
            System.out.println(a);
        });

        frame.setLayout(null);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new TestDialogBox();
    }
}