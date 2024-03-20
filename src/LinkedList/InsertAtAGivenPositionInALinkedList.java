package LinkedList;

import java.util.LinkedList;

public class InsertAtAGivenPositionInALinkedList {

    public static void printLinkList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static Node insertAtPos(Node head, int item , int position){

        Node temp = new Node(item);
        if(position == 1){
            temp.next =  head;
            return temp;
        }
        Node curr = head;
        for(int i = 1; i < position-1 && curr != null; i++){
            curr = curr.next;
        }
        if(curr == null){
            return head;
        }

        // below operation is for insertion
        temp.next = curr.next;
        curr.next = temp;
        return head;

    }

    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        printLinkList(head);
        head = insertAtPos(head,25,2);
        printLinkList(head);
    }
}
