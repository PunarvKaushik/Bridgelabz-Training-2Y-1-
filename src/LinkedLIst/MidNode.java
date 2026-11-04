package LinkedLIst;

public class MidNode {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;

    public static void insertAtStart(int value) {
        Node temp = new Node(value);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    public static void insertAtEnd(int value) {
        Node temp = new Node(value);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }
    public static int midNode(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }

    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        insertAtEnd(50);
        insertAtStart(40);
        insertAtEnd(60);
        insertAtStart(30);
        insertAtStart(20);
        insertAtStart(10);
        insertAtEnd(70);
        display();
        System.out.println();
        System.out.println("Middle Node "+midNode());
    }
}
