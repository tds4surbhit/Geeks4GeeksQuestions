package LinkedList;

public class ReverseADoublyLinkedIn {

    public static Node reverseDoublyLinkedList(Node head){
        Node curr1 = head;
        Node curr = head;
        while(curr != null){
           if(curr.next == null){
               curr.next = head;
               head.prev = curr;
           }
        }
        curr1.next = null;
        return curr;
    }


    public static void printLinkedlist(Node head){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data + " ");
            curr=curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);

        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        printLinkedlist(head);
        Node ans = reverseDoublyLinkedList(head);
        printLinkedlist(ans);

    }
}
