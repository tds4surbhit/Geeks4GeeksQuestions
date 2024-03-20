package LinkedList;

public class DeleteLastNodeInLinkedList {

    public static void printLinkedList(Node head){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static Node deleteLastNode(Node head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
             return null;
        }

        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }

        curr.next = null;
        return head;
    }

    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        printLinkedList(head);
        // this also works
        Node updateHead = deleteLastNode(head);
        printLinkedList(updateHead);
    }


}
