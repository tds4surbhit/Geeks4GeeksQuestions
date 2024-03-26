package LinkedList;

public class InsertAtTheEndInLinkedIn {

    public static Node insertAtTheEndInDoublyLinkedList(Node head, int item){
        Node element = new Node(item);

        if(head == null){
            return element;
        }
        Node curr = head;
        while (curr.next != null){
            curr = curr.next;
        }

        curr.next = element;
        element.prev = curr;
        return head;
    }

    public static void printLinkedlist(Node head){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.prev= head;
        temp1.next = temp2;
        temp2.prev = temp1;
        int item = 5;
        printLinkedlist(head);
        head = insertAtTheEndInDoublyLinkedList(head,item);
        printLinkedlist(head);
    }
}
