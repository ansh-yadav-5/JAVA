import java.sql.*;

public class TestResultSetMetaData {
    public static void main(String[] args ) throws SQLException,ClassNotFoundException{
         // Load the JDBC driver 
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded");

        // Connect to a database
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/javabook", "root", "3012");
        System.out.println("Database connected");

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from Enrollment");

        ResultSetMetaData rsMetaData = resultSet.getMetaData();
        for(int i = 1; i<= rsMetaData.getColumnCount(); i++)
            System.out.printf("%-12s\t", rsMetaData.getColumnName(i));
        System.out.println();

        while (resultSet.next()) {
            for(int i = 1; i <= rsMetaData.getColumnCount(); i++)
                System.out.printf("%-12s\t", resultSet.getObject(i));
            System.out.println();
        }

        connection.close();
    }
}
