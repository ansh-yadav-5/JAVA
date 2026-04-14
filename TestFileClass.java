public class TestFileClass {
    public static void main(String[] args) {
        java.io.File File = new java.io.File("Add.java");
        System.out.println("Does file exist? " + File.exists());
        System.out.println("The file has " + File.length() + " bytes ");
        System.out.println("Can it be read? " + File.canRead());
        System.out.println("Can it be written? " + File.canWrite());
        System.out.println("It is a directory? " + File.isDirectory());
        System.out.println("It is a file? " + File.isFile());
        System.out.println("It is hidden? " + File.isHidden());
        System.out.println("Last modified on " + new java.util.Date(File.lastModified()));

    }
}
