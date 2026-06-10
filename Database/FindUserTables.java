import java.sql.*;

public class FindUserTables {
    public static void main(String[] args) throws SQLException,ClassNotFoundException{
         // Load the JDBC driver 
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded");

        // Connect to a database
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/javabook", "root", "3012");
        System.out.println("Database connected");

        DatabaseMetaData dbMetaData = connection.getMetaData();

        ResultSet rsTables = dbMetaData.getTables(null,null,null, new String[] {"TABLE"});
        System.out.println("User tables: ");
        while (rsTables.next()) {
            System.out.println(rsTables.getString("TABLE_NAME") + " ");

            connection.close();
        }
    }
}
