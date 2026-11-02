import java.util.Stack;
import java.util.Vector;

public class LegacyExample {
    public static void main(String[] args){
        Vector<Integer> vector = new Vector<>();

        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.println("Vector: " + vector);
        vector.remove(1);
        System.out.println("After remove: " + vector);

        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("Stack:" + stack);
        System.out.println("peek: " + stack.peek());
        System.out.println("Pop:" + stack.pop());
        System.out.println("After pop: " + stack);
    }
}
