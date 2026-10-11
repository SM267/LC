import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeLinkedlist {
    static Scanner sc = new Scanner(System.in);
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public boolean isPalindrome(Node head) {
        ArrayList<Integer> ll=new ArrayList<>();
        Node cur=head;
        while(cur!=null){
            ll.add(cur.data);
            cur=cur.next;
        }
        int left=0;
        int right=ll.size()-1;
        while(left<right){
            if(!ll.get(left).equals(ll.get(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
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
        PalindromeLinkedlist oo=new PalindromeLinkedlist();
        oo.printll(head);
        oo.isPalindrome(head);
        boolean nn=oo.isPalindrome(head);
        System.out.println(nn);
    }
}
/*
public boolean isPalindrome(ListNode head) {
        Stack<Integer> st=new Stack<>();
        ListNode cur=head;
        while(cur!=null){
            st.push(cur.val);
            cur=cur.next;
        }
        cur=head;
        while(cur!=null){
            if(cur.val!=st.pop()){
                return false;
            }
            cur=cur.next;
        }
        return true;
    }
*/