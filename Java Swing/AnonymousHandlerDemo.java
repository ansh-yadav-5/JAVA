import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class AnonymousHandlerDemo {
    AnonymousHandlerDemo(){
        JFrame j = new JFrame("An event example ");
        j.setLayout(new FlowLayout());
        j.setSize(220, 150);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jbtnok = new JButton("OK");
        jbtnok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Ok btn press");
            }
        });
        JButton jbtnCancel = new JButton("cancel");
        jbtnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Cancel btn press");
            }
        });
        j.add(jbtnok);
        j.add(jbtnCancel);
        JLabel jlab = new JLabel("Press a button");
        j.add(jlab);
        j.setVisible(true);

    }
    public static void main(String[] args) {
        new AnonymousHandlerDemo();
    }
}
