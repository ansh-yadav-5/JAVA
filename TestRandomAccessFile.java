import java.io.*;

public class TestRandomAccessFile {
    public static void main(String[] args) throws IOException {
        try(RandomAccessFile inout = new RandomAccessFile("inout.dat", "rw");
    ){
        inout.setLength(0);
        for(int i=0; i<200;i++)
            inout.writeInt(i);
        System.out.println("Current File length is " + inout.length());
        inout.seek(0);
        System.out.println("The First number is " + inout.readInt());
        // Retrieve the tenth number
        inout.seek(9*4);
        System.out.println("The tenth number is " + inout.readInt());

        inout.writeInt(555);
        // Append a new number
        inout.seek(inout.length());
        inout.writeInt(999);
        // Display new length
        System.out.println("The new length is " + inout.length());
    }
    }
}
