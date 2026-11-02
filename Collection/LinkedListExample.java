import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args){
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.addFirst("Lion");
        animals.addLast("Tiger");

        System.out.println("LinkedList: " + animals);
        System.out.println("First: " + animals.getFirst());
        System.out.println("Last: " + animals.getLast());
        animals.removeFirst();
        animals.removeLast();

        System.out.println("After removals: " + animals);

        animals.offer("Elephant");
        System.out.println("After offer: " + animals);
        System.out.println("Poll: " + animals.poll());
        System.out.println("After poll: " + animals);
    }
}
