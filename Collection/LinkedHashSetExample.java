import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
  public static void main(String[] args) {
    Set<Integer> Ihs = new LinkedHashSet<>();
    Ihs.add(5);
    Ihs.add(1);
    Ihs.add(9);
    Ihs.add(5);


    System.out.println("LinkedHashSet: " + Ihs);
  }  
}
