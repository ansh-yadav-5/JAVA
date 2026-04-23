import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;



public class FlowLayoutExample {
    FlowLayoutExample(){
        JFrame f = new JFrame("Layout");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l1 = new JLabel("This is first label ");
        f.add(l1);
        JLabel l2 = new JLabel("This is second Label");
        f.add(l2);
        JLabel l3 = new JLabel("This is third Label");
        f.add(l3);

        f.setLayout(new FlowLayout(2,30,30));
        f.setSize(300, 300);

        Font font1 = new Font("Bell MT",1,24);
        Font font2 = new Font("Bell MT",4,24);
        l1.setFont(font1);
        l2.setFont(font2);
        l3.setFont(font1);
        f.setVisible(true);

        JLabel l4 = new JLabel("Enter your name ");
        f.add(l4);
        JTextField tf1 = new JTextField();
        f.add(tf1);
        JButton btn = new JButton("Print Name");
        f.add(btn);

        f.setLayout(new GridLayout(2, 2, 30, 30));
        f.setSize(300,100);
    }
    public static void main(String[] args) {
        new FlowLayoutExample();
    }
}
