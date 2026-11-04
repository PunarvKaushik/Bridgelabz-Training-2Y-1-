package LinkedLIst;

public class LinkedListInsert {

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

    public static void countNodes(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println(count);
    }

    public static int searchNodes(int value){
        Node temp=head;
        int index=0;
        while(temp!=null){
            if(temp.data==value){
                return index;
            }
            else{
                temp=temp.next;
                index++;
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
        insertAtEnd(40);
        insertAtEnd(50);
        insertAtStart(30);
        insertAtStart(20);
        insertAtStart(10);
        display();
        System.out.println();
        countNodes();
        System.out.println(searchNodes(50));
    }
}
