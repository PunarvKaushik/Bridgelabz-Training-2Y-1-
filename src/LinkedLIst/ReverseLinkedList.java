package LinkedLIst;

public class ReverseLinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }

    public static Node head;
    public static Node tail;

    public static void insertAtStart(int value){
        Node temp=new Node(value);
        if(head==null){
            head=temp;
            tail=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }
    }

    public static void insertAtEnd(int value){
        Node temp=new Node(value);
        if(head==null){
            head=temp;
            tail=temp;
        }
        else{
            tail.next=temp;
            tail=temp;
        }
    }

    public static void reverse(){
        Node prev=null;
        Node current=head;
        while(current!=null) {
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
    }

    public static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
    }

    public static void main(String[] args){
        insertAtEnd(50);
        insertAtStart(40);
        insertAtEnd(60);
        insertAtStart(30);
        insertAtStart(20);
        insertAtStart(10);
        display();
        System.out.println();
        display();

    }

}
