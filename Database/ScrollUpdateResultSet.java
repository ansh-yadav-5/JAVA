import java.sql.*;

public class ScrollUpdateResultSet {
    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/studentdb", "root", "3012");

        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

        ResultSet resultSet = statement.executeQuery("select id , name from t1");

        System.out.println("Before update ");
        displayResultSet(resultSet);

        resultSet.absolute(2);  // Move cursor to the second row
        resultSet.updateString("id", "120");  // Update the column 
        resultSet.updateString("name", "Ankur"); // Update the column 
        resultSet.updateRow(); // Update the row in the data source 

        resultSet.last();
        resultSet.moveToInsertRow(); // Move cursor to the insert row 
        resultSet.updateString("id", "119");
        resultSet.updateString("name", "Riya");
        resultSet.insertRow(); // Insert the row 
        resultSet.moveToCurrentRow(); // Move the cursor to the current row 

        resultSet.absolute(4);
        resultSet.deleteRow(); 

        System.out.println("After update ");

        resultSet = statement.executeQuery("select id, name from t1");
        displayResultSet(resultSet);

        resultSet.close();


    }

    private static void displayResultSet(ResultSet resultSet) throws SQLException {
        ResultSetMetaData rsMetaData = resultSet.getMetaData();
        resultSet.beforeFirst();
        while (resultSet.next()) {
            for(int i = 1; i <= rsMetaData.getColumnCount(); i++)
                System.err.printf("%-12s\t", resultSet.getObject(i));
            System.out.println();
        }
    }
}
