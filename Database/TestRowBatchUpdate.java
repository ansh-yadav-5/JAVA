import java.sql.*;

public class TestRowBatchUpdate {
    public TestRowBatchUpdate(){
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/studentdb" , "root", "3012");
            Statement stmt = conn.createStatement();
            stmt.addBatch("create table t1(id int primary key, name varchar(20)");
            stmt.addBatch("insert into t1 values(115, 'Ankit')");
            stmt.addBatch("insert into t1 values(116, 'Shivam')");
            stmt.addBatch("insert into t1 values(117, 'Himanshu')");
            stmt.addBatch("insert into t1 values(118, 'Mohit')");
            int count[] = stmt.executeBatch();

            for(int c : count )
                System.out.print(c + " ");
            System.out.println();
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }

    public static void main(String[] args) {
        new TestRowBatchUpdate();
    }
}
