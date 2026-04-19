import javax.swing.*;

public class LabelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Label");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lbl = new JLabel("First Label");
        lbl.setBounds(50, 50, 80, 30);
        frame.add(lbl);

        frame.setSize(300,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
