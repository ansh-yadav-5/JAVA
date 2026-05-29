import java.sql.*; 
public class DBHandler implements DBAttributes{ 
 
    Connection conn; 
    Statement stmt; 
    PreparedStatement pstmt; 
 
    public DBHandler(){ 
        try{ 
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD); 
            System.out.println("Connected"); 
            stmt = conn.createStatement(); 
 
            //first create database and use database 
            try { 
                stmt.executeUpdate("create database studentdb"); 
                // conn.commit(); 
                System.out.println("\nDatabase created"); 
            } catch(SQLException e){ 
                System.out.println("\nDatabase already exists"); 
            } finally{ 
                stmt.executeUpdate("use studentdb"); 
                System.out.println("\nDatabase selected"); 
            } 
 
            // second create table 
            try{ 
                stmt.executeUpdate("create table students(studentid int primary key, sname varchar(50) not null, course varchar(20) not null, mobno varchar(12))"); 
            } catch(Exception e){ 
                System.out.println("\nTable already exists"); 
            } 
 
             
             
        } catch (Exception e){ 
            System.out.println("\nSomething want wrong to create connection " 
            + e); 
        } 
    }
     public void add(int studentid, String sname, String course, String mobno){ 
        try{ 
            pstmt = conn.prepareStatement("insert into students (studentid, sname, course, mobno) values (?,?,?,?)"); 
            pstmt.setInt(1, studentid); 
            pstmt.setString(2, sname); 
            pstmt.setString(3, course); 
            pstmt.setString(4, mobno); 
            pstmt.executeUpdate(); 
            System.out.println("\nStudent saved successfully"); 
        } catch(SQLException e){ 
            if(e.getErrorCode() == 1062){ 
                System.out.println("\nStudent id already exists"); 
            } 
        } catch(Exception e){ 
            System.out.println("\nSomething want wrong to add student " + e); 
        }    
    } 
     public void showAll(){ 
        try{ 
            ResultSet rs = stmt.executeQuery("select * from students"); 
            while(rs.next()){ 
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4)); 
            } 
            System.out.println(); 
        } catch(Exception e){ 
            System.out.println("\nSomething want wrong to fetch data " + e); 
        } 
    } 

    public void getDataByID(int studentId){
        try{
            pstmt = conn.prepareStatement("select * from students where studentid = ?", ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            pstmt.setInt(1, studentId);
            ResultSet rs = pstmt.executeQuery();
            if (!rs.next()) {
                System.out.println("\nid" + studentId + " record not found");
            }else{
                rs.beforeFirst();
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
                }
            }
        } catch(Exception e){
            System.out.println("\nSomething want wrong to fetch data" + e);
        }
    }

    public void updateRecord(int studentid, String sname, String course){
        try {
            pstmt = conn.prepareStatement("update students set sname = ?,course = ? where studentid = ?");
            pstmt.setString(1, sname);
            pstmt.setString(2, course);
            pstmt.setInt(3, studentid);
            pstmt.executeUpdate();
            System.out.println("\nUpdate successfully");
        } catch (Exception e) {
            System.out.println("\nError to update student " + e);
        }
    }

    public void deleteRecord(int studentid){
        try {
            pstmt = conn.prepareStatement("delete from students where studentid = ?");
            pstmt.setInt(1, studentid);
            pstmt.executeUpdate();
            System.out.println("\nDelete successfully");
        } catch (Exception e) {
            System.out.println("\nError to delete student " );
        }
    }
}