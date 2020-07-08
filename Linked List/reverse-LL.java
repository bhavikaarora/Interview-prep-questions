
class ReverseLL
{
    // This function should reverse linked list and return
    // head of the modified linked list.
    Node reverseList(Node head)
    {
        // code here
        Node p = head;
        Node q = null;
        Node r = null;
        while(p!=null){
            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }
        head = q;
        return q;
        
    }
}
