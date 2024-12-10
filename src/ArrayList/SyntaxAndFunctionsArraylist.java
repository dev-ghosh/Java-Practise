package ArrayList;
import java.util.ArrayList;
public class SyntaxAndFunctionsArraylist {
    public static void main(String[] args) {
        // SYNTAX
        ArrayList<Integer> l1=new ArrayList<>();
      //  ArrayList<Boolean> l2=new ArrayList<>();
      //  ArrayList<Float> l3=new ArrayList<>();

        // 1. adding new elements
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        // 2. get/print an element at index i
        System.out.println(l1.get(1)); //1 is index ie 6 will be the ans

        // 3. print arraylist with loops
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i)); // 5 6 7 8
        }

        // 4. print arraylist directly without loops
        System.out.println(l1); // [5,6,7,8]

        // 5. adding element at any index i
               //for eg we need 5 100 6 7 8
        l1.add(1,100); // 1 is index 100 is element
        System.out.println(l1); // [5,100,6,7,8]

        // 6. modifying/changing element at index i
        l1.set(1,10);
        System.out.println(l1); // [5 10 6 7 8]

        // 7. removing an element at any index i
        l1.remove(1);
        System.out.println(l1); // [5,6,7,8] org value ie 6 will come again

        // 8. removing an element e
        l1.remove(Integer.valueOf(7)); // value not index
        System.out.println(l1); // [ 5 6 8]

        // 9. checking if an element exists
        boolean ans =l1.contains(Integer.valueOf(6));
        System.out.println(ans);
    }
}
