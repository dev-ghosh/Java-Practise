package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class Q2ndmethodReverse {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(9);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("original list " + list);
        Collections.reverse(list);
        System.out.println("reversed list " + list);
    }
}
