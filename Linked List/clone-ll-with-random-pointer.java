/*

https://practice.geeksforgeeks.org/problems/clone-a-linked-list-with-next-and-random-pointer/1

You are given a Singly Linked List with N nodes where each node next pointing to its next node. You are also given M random pointers , where you will be given M number of pairs denoting two nodes a and b  i.e. a->arb = b.


*/

class Clone {
    Node copyList(Node head) {
        // your code here
        if(head==null) return head;
        
        Node curr = head;
        //inserting nodes in between and making ll double it's size
        while(curr!=null){
            Node clone = new Node(curr.data);
            Node nextnode = curr.next;
            clone.next = nextnode;
            curr.next = clone;
            curr = nextnode;
        }
        
        curr = head;
        
        while(curr!=null){
            if(curr.arb==null) curr.next.arb = null;
            else curr.next.arb = curr.arb.next;
            
            curr = curr.next.next;
        }
        
        curr = head;
        Node clonehead = new Node(0); //next node from this would be the actual head of the cloned ll
        Node temp = clonehead;   
        
        while(curr!=null){
            Node nextnode = curr.next.next;
            temp.next = curr.next;
            temp = temp.next;
            curr.next = nextnode;
            curr = nextnode;
        }
        
        return clonehead.next;
        
    }
}
