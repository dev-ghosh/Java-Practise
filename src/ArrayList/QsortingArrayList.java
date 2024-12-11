package ArrayList;
import java.util.Collections;
import java.util.ArrayList;
public class QsortingArrayList {
    public static void main(String[] args) {

        // USING COLLECTIONS

        ArrayList<Integer> list =new ArrayList<>();
        list.add(9);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("original list " + list);
        Collections.sort(list); // for ascending
        System.out.println("ascending order " + list);
        Collections.sort(list, Collections.reverseOrder()); // for descending
        System.out.println("descending order " + list);
    }

}
