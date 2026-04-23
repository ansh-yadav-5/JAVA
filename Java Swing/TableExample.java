import javax.swing.*;


public class TableExample {
    JFrame f;
    TableExample(){
        f = new JFrame();
        String column [] = {"ID", "Name", "Salary"};

        String [][] data = {
            {"101", "Amit", "6,70,000"},
            {"102  ", "Jai", "7,80,000"},
            {"103", "Sachin", "7,00,000"}
        };
        JTable jt = new JTable(data,column);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300,400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new TableExample();
    }
}
