package LinkedList;

public class SearchInAlinkedList {


    // Recursive
    public static int findInTheLinkedList(Node head, int item){
        if(head == null){
            return -1;
        }
        if(head.data == item){
            return 1;
        }

        int response = findInTheLinkedList(head.next,item);
        if(response == -1) return -1;
        else return (response + 1);


    }



//    public static int findInTheLinkedList(Node head, int item){
//        int position = 1;
//        Node curr = head;
//        while (curr != null){
//            if(curr.data == item){
//                return position;
//            }
//            position++;
//            curr= curr.next;
//        }
//        return -1;
//    }

    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(20);
        head.next.next.next = new Node(15);
        int item = 20;
        int ans = findInTheLinkedList(head,item);
        System.out.println(ans);
    }
}
