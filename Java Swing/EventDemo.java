import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class EventDemo {
    EventDemo(){
        JFrame jfrm = new JFrame("An event Example");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(220, 90);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jbtnAlpha = new JButton("Alpha");
        JButton jbtnBeta = new JButton("Beta");

        AlphaHandlerClass handler1 = new AlphaHandlerClass();
        jbtnAlpha.addActionListener(handler1);
        BetaHandlerClass handler2 = new BetaHandlerClass();
        jbtnBeta.addActionListener(handler2);
        jfrm.add(jbtnAlpha);
        jfrm.add(jbtnBeta);
        JLabel jlab = new JLabel("Press a button");
        jfrm.add(jlab);
        jfrm.setVisible(true);
    }

    class AlphaHandlerClass implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            System.out.println("Alpha btn press");
        }

        
    }

    class BetaHandlerClass implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            System.out.println("Beta btn press");
        }
    }

    public static void main(String[] args) {
        EventDemo win = new EventDemo();
    }
}
