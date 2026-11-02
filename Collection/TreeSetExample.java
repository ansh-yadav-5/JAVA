import java.util.TreeSet;
import java.util.Set;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(1);
        ts.add(9);
        ts.add(3);
        ts.add(5);

        System.out.println("TreeSet (sorted): " + ts);
        System.out.println("First: " + ((TreeSet<Integer>)ts).first());
        System.out.println("Last: " + ((TreeSet<Integer>)ts).last());
        System.out.println("HeadSet(<5): " + ((TreeSet<Integer>)ts).headSet(5));
        System.out.println("TailSet(>=5: " + ((TreeSet<Integer>)ts).tailSet(5));
        System.out.println("SubSet(2 to 8): " + ((TreeSet<Integer>)ts).subSet(2, 8));
    }    
}
