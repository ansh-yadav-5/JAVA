public class MainController {
 public static void main(String[] args) { 
        DBHandler db = new DBHandler();

       //  Add Two Students
        db.add(1, "Himanshu Rastogi", "BCA", "7251838064"); 
        db.add(2, "Mohit Rastogi", "BSC", "6787654567");

       //  Get all Students
        System.out.println("\nAll students is"); 
        db.showAll(); 

       //  Get students by Id
       System.out.println("\nStudent id 5, student is ");
       db.getDataByID(5);

       System.out.println("\nStudent id 2, student is");
       db.getDataByID(2);

       // Update studentid 2
       db.updateRecord(2, "Shivam Rastogi", "B.Tech");

       // Get data after update
       System.out.println("\nAfter update student");
       db.showAll();

       // Delete student
       db.deleteRecord(2);
       System.out.println("\nAfter delete student");
       db.showAll();
 }
}