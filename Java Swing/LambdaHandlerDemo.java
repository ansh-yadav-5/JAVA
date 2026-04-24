import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class LambdaHandlerDemo {
    LambdaHandlerDemo(){
        JFrame j = new JFrame("An event example");
        j.setLayout(new FlowLayout());
        j.setSize(220, 150);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jbtnok = new JButton("OK");
        jbtnok.addActionListener((ActionEvent e) -> {
            System.out.println("Ok btn press");
        });
        JButton jbtncancel = new JButton("Cancel");
        jbtncancel.addActionListener((ActionEvent e) -> {
            System.out.println("Cancel btn press");
        });

        j.add(jbtnok);
        j.add(jbtncancel);
        j.setVisible(true);
    }
    public static void main(String[] args) {
        new LambdaHandlerDemo();
    }
}
