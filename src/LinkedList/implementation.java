package LinkedList;

public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head =null;
        Node tail=null;
        int size=0;
        void insertAtEnd(int val){ //public static not written coz its already inside it
            Node temp= new Node(val); // new value putted into temp
            //tail.next=temp; // value linked to tail
           // tail=temp; // tail will go to temp now
            //will check if ll is empty or not
            if(head==null){ // when list empty
                head=temp;
                tail=temp;
            }
            else{ // when not empty
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        void insertAtHead(int val){
            Node temp=new Node(val);
            if(head==null){ //empty
                head=temp;
                tail=temp;
                // head=tail=temp;another method
            }
            else{ // non empty
                temp.next=head;
                head=temp;
            }
            size++;
        }
        void insertAt(int idx,int val){ //inserting at any index
            Node t= new Node(val); // new node created
            Node temp=head;
            if(idx==size()){
                insertAtEnd(val);
                return;
            }
            else if(idx==0){
                insertAtHead(val);
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            size++;
        }
        int getAt(int idx){
            Node temp=head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        void display(){ // public static not written same reason as above
            Node temp=head; // temp or head same thing
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println(); // giving a space at each line
        }
        void deleteAt(int idx){
            Node temp=head;
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            if(idx==size-1) tail=temp;
        }
        int size(){ // this one is extra to find length and to be used in insertAt
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedlist ll= new linkedlist();
        ll.insertAtEnd(4);
        ll.display();// 4
        ll.insertAtEnd(5); // 4 5
        ll.display();
        ll.insertAtEnd(12); // 4 5 12
        ll.display();
        ll.insertAtHead(13); // 13 4 5 12
        ll.display();
        ll.insertAt(2,10); // 13 4 10 5 12
        ll.display();
        System.out.println(ll.getAt(4));
        ll.deleteAt(3);
        ll.display();
    }
}
