
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args){
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");

        System.out.println("List: " + fruits);
        System.out.println("Size: " + fruits.size());
        System.out.println("Element at index 1: " + fruits.get(1));
        fruits.remove(2);
        System.out.println("After remove: " + fruits);
        System.out.println("Index of Apple: " + fruits.indexOf("Apple"));
    }    
}
