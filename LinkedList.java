public class LinkedList {
    Node head;
    Node tail;
    private int size;
    LinkedList(){
        this.size=0;
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            size++;
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
        Node newNode = new Node(data);
        if(head == null){
           head=newNode;
           return;
        }
      Node currNode=head;
      while(currNode.next!=null){
        currNode=currNode.next;
      }
      currNode.next=newNode;

    }
    public void deleteFirst(){
        if(head==null){
            System.out.print("List is empty");
        }
        size--;
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.print("List is empty");
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondNode=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondNode=secondNode.next;
        }
        secondNode.next=null;
    }
    public void printList(){
      Node currNode=head;
      while(currNode!=null){
        System.out.print(currNode.data +"-->");
        currNode=currNode.next;
      }
      System.out.print("null");
    }
    public int getSize(){
        return size;
    }

    public static void main(String[]args){
        LinkedList List = new LinkedList();
        List.addFirst(2);
        List.addLast(4);
        List.addLast(6);
        List.addLast(8);
        List.printList();
        List.deleteLast();
        List.printList();
        System.out.print(List.getSize());

    }
}
