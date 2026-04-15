import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {
    public static void main(String[] args) throws Exception {
        if (args.length != 4) {
            System.out.println("Usage: java ReplaceText SourceFile targetFile oldStr newStr ");

        }
        File SourceFile = new File(args[0]);
        if (!SourceFile.exists()) {
            System.out.println("Source file " + args[0] + "does not exist ");
            System.exit(2);
        }
        File targetFile = new File(args[1]);
        if (targetFile.exists()) {
            System.out.println("Target file " + args[1] + " Already exists ");
            System.exit(3);
        }
        try(
            Scanner input = new Scanner (SourceFile);
            PrintWriter output = new PrintWriter(targetFile);
        ) {
            while (input.hasNext()) {
                String S1 = input.nextLine();
                String S2 = S1.replace(args[2], args[3]);
                output.println(S2);
            }
        }
    }
}
