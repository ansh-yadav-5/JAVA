import javax.swing.*;

public class ExtendingFrameClass extends JFrame {
    ExtendingFrameClass (){
        JButton btn = new JButton("OK");
        btn.setBounds(10, 10, 100, 30);
        add(btn);

        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ExtendingFrameClass();
    }
}