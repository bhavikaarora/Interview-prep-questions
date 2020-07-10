
/*Given a singly linked list of size N of integers. The task is to check if the given linked list is palindrome or not.

Example:
Input:
2
3
1 2 1
4
1 2 3 4
Output:
1
0

*/


class Palindrome
{
    // Function to check if linked list is palindrome
    
    Node reverse(Node head){
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
    
    boolean isPalindrome(Node head) 
    {
        //Your code here
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = head;
        slow = reverse(slow);
        
        while(slow!=null){
            if(fast.data!=slow.data){
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }    
}

