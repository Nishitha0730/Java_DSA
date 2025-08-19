package Linked_List.Singly_Linked_List;

public class Main {
    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.insertLast(10);
        sll.insertFirst(20);
        sll.insertAtIndex(1, 15);
        sll.display();
        // sll.insertAtIndex(100, 11);
        sll.deleteFirst();
        sll.display();

        sll.insertFirst(22);
        sll.display();

        sll.deleteLast();
        sll.display();

        sll.insertLast(123);
        sll.display();
    }
}
