import javax.swing.*;

public class ImageInButton {
    ImageInButton(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon("icon.jpg");
        JButton btn = new JButton(icon);
        btn.setBounds(50,50,100,50);
        frame.add(btn);
        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new ImageInButton();
    }
}
