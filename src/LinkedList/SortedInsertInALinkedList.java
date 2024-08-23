package LinkedList;

public class SortedInsertInALinkedList {

    public static void printLinkedlist(Node head){
        Node curr = head;
        while (curr.next != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static Node sortedInsertInLinkedList(Node head, int x){
        Node curr = head;
        if(curr.next == null){
            if(curr.data > x){
                Node temp = head;
                Node temp2 = new Node(x);
                temp2.next = temp;
                temp.next = null;
                return temp2;
            }
        }
        while(curr != null){
            if(curr.next.data > x){
                Node temp = new Node(x);
                Node temp1 = curr.next;
                temp = curr.next;
                temp.next = temp1;
                return head;
            }
            curr = curr.next;
        }
        return head;
    }

    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        int x = 25;
        printLinkedlist(head);
        Node ans = sortedInsertInLinkedList(head,x);
        printLinkedlist(ans);
    }
}
