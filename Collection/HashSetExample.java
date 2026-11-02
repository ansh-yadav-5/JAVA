import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java");

        System.out.println("HastSet: " + set);
        System.out.println("Contains 'Java'?" + set.contains("Java"));
        set.remove("C++");
        System.out.println("After remove: " + set);
        System.out.println("Size: " + set.size());
    }
}
