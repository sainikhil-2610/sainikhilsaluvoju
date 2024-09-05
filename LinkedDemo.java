import java.util.*;
import java.util.LinkedList;
public class LinkedDemo {
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
         head=newNode;
         return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
      Node newNode=new Node(data);
      Node currNode = head;
      if(head == null){
        head=newNode;
        return;
      }
   if(currNode!=null){
    currNode=currNode.next;
    if(currNode.next==null){
      currNode=newNode;
    }
   }
}
    
    public void printList(){
         Node curNode = head;
         while (curNode!=null) {
            System.out.print(curNode.data+"-->");
            curNode=curNode.next;
         }
         System.out.print("null");

    }
    public void deleteFirst(){
        Node currNode=head;
        head=currNode.next;
    }

    public static void main(String[]args) {
        LinkedDemo list = new LinkedDemo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Numbers:");
        int n=sc.nextInt(); 
        list.addFirst(n);
        /*list.addFirst(2);
        list.addLast(6);
        list.printList();*/
    }
}
