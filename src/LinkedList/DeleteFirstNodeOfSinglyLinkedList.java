package LinkedList;

public class DeleteFirstNodeOfSinglyLinkedList {

    public static void printLinkedList(Node head){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static Node linkedListDelete(Node head){
        if(head == null){
            return null;
        }
        return head.next;
    }

    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        printLinkedList(head);
        // this also works
        Node updateHead = linkedListDelete(head);
        printLinkedList(updateHead);
    }
}
