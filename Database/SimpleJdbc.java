import java.sql.*;

public class SimpleJdbc {
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/javabook", "root", "3012");
        System.out.println("Database connected"); 
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("show tables");
        while(rs.next()){
           System.out.println(rs.getString(1));
        }
    }
}
