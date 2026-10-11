import java.util.*;
public class Linkedlistcycle{
    static Scanner sc = new Scanner(System.in);
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    void mid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println();
        System.out.println(slow.data);
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
        Linkedlistcycle oo=new Linkedlistcycle();
        oo.printll(head);
        oo.mid(head);
    }
}
/*
 boolean cycle(Node head){
        Node cur1=head;
        HashSet<Node> hs=new HashSet<>();
        while (cur1 != null) {
            if(hs.contains(cur1)){
                return true;
            }
            hs.add(cur1);
            cur1=cur1.next;
        }
        return false;
    } */
   /*
   boolean cycle(Node head){
        Node i=head;
        Node j=head;
        while(j.next!=null && j!=null){
            i=i.next;
            j=j.next.next;
            if(i==j){
                return true;
            }
        }
        return false;
    }
   */