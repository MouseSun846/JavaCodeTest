import java.util.LinkedList;
import static myprint.Print.*;
public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<Integer>();
        stack.push(100);
        println(stack.pop());
        println(stack.isEmpty());
    }
}
