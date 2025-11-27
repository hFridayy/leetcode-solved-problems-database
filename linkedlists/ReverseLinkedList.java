package linkedlists;

public class ReverseLinkedList {
    public Node reverse(Node head){

        Node curr = head;
        Node prev = null;

        while(curr != null){

            Node nextNode = curr.next; //save the next position
            curr.next = prev; //change the pointer
            curr = nextNode;
            prev = curr; //move pounters 
        }
        return prev;
    }
}
