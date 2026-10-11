import java.util.*;
class LinkedList1 {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node sort(Node head){
        Node cur=head;
        while(cur != null && cur.next != null){
            if(cur.data == (cur.next).data){
                cur.next=cur.next.next;
            }
            else cur=cur.next;
        }
        return head;
    }
    void printll(Node head) {
        Node cur1 = head;
        while (cur1 != null) {
            System.out.print(cur1.data);
            if (cur1.next != null) {
            System.out.print("->");
            }
            cur1 = cur1.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head=null,curr=null;
        System.out.println("Enter Values:");
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            Node newnode= new Node(value);
            if(head==null){
                head=newnode;
                curr=newnode;
            }
            else{
                curr.next=newnode;
                curr=newnode;
            }
        }
        LinkedList1 oo=new LinkedList1();
        oo.printll(head);
        oo.sort(head);
        System.out.println();
        oo.printll(head);
    }
}








































/*public class LinkedList1 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
        //Node head=new Node(n);
        LinkedList1 nn=new LinkedList1();
        nn.head=new Node(first);
        System.out.println("Just val:"+nn.head);
        System.out.println("Just val:"+nn.head.data);
        System.out.println("Just val:"+nn.head.next);
    }
} */