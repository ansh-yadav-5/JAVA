

import javax.swing.*;



public class UsingFrameObject {
    public UsingFrameObject(){
        JFrame frame = new JFrame("Home");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton btn = new JButton("OK");
        btn.setBounds(100,100,100,30);
        frame.add(btn);

        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new UsingFrameObject();
    }
}
