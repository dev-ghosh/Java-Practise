package LinkedList;

public class basicLL {
    public static class Node{ // node is the class name
        int data;
        Node next; // next stores the address of next node
        Node(int data){ //constructor
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        // to make 5 3 9 8 16
        // to link/connect :
        a.next=b; //b ke adress ko next me daldiya
       // System.out.println(b.data); //b.data or a.next.data
        b.next=c;
        c.next=d;
        d.next=e;
       // System.out.println(a.next.next.next.next.data); // ie d
        Node temp=a;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
