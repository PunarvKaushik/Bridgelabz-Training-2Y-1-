package LinkedLIst;

public class LinkedListSearch {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }

    static Node head;
    static Node tail;

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

    public static int searchNode(int value){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==value){
                return i;
            }
            else{
                temp=temp.next;
                i++;
            }
        }
        return -1;
    }

    public static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
    }

    public static void main(String[] args){
        insertAtEnd(48);
        insertAtEnd(59);
        insertAtStart(22);
        insertAtStart(100);
        insertAtStart(69);
        display();
        System.out.println();
        System.out.println("Index of element 100 is at : "+searchNode(100));
    }
}
