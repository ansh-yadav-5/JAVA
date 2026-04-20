import javax.swing.*;

public class TextFieldExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TextField");
        JTextField tf1,tf2;
        tf1 = new JTextField("Hello Java ");
        tf1.setBounds(50,100,200,30);
        frame.add(tf1);
        tf2 = new JTextField("Welcome to my world! ");
        tf2.setBounds(50, 150, 200, 30);
        frame.add(tf2);
        
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
