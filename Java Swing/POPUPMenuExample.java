import javax.swing.*;
import java.awt.event.*;



public class POPUPMenuExample {
    POPUPMenuExample(){
        JFrame f = new JFrame("POPupMenu Example");
        JPopupMenu popupmenu = new JPopupMenu("Edit");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");

        popupmenu.add(cut);
        popupmenu.add(copy);
        popupmenu.add(paste);

        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                popupmenu.show(f,e.getX(),e.getY());
            }
        });

        f.add(popupmenu);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(300, 300);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new POPUPMenuExample();
    }
}
