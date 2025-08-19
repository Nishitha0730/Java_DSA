package Linked_List.Singly_Linked_List;

public class SLL{

    private Node head;
    private Node tail;
    private int size;

    public SLL() {
        this.size = 0;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail==null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        if(tail == null){
            insertFirst(value);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAtIndex(int index,int value){
        Node node  = new Node(value);
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if(index==0){
            insertFirst(value);
            return;
        }else if(index == size){
            insertLast(value);
            return;
        }
        Node temp = head;
        int count=index;
        while(count>1){
            temp = temp.next;
            count--;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
            this.next = null;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}