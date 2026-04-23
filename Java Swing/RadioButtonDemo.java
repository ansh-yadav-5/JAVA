import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonDemo {
    RadioButtonDemo(){
        JFrame frame = new JFrame("CheckBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");
        r1.setBounds(75, 50, 100, 30);
        r2.setBounds(75, 100, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        frame.add(r1);
        frame.add(r2);

        frame.setLayout(null);
        frame.setSize(300,300);
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new RadioButtonDemo();
    }
}
