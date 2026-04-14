import java.io.IOException;

public class WriteData2 {
    public static void main(String[] args)  throws IOException{
        java.io.File file = new java.io.File("2.txt");
        if (file.exists()) {
            System.out.println("File already exists ");
            System.exit(1);
        }

        try (java.io.PrintWriter output = new java.io.PrintWriter(file)){
        output.print("John T Smith  ");
        output.println(50);
        output.print("Eric k Jones  ");
        output.println(24);
        
        }
    }
}

