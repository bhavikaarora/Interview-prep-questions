/*
Given an unsorted linked list of N nodes. The task is to remove duplicate elements from this unsorted Linked List. When a value appears in multiple nodes, the node which appeared first should be kept, all others duplicates are to be removed.


Example:
Input:
2
4
5 2 2 4
5
2 2 2 2 2
Output:
5 2 4
2

*/



class GfG
{
    // Function to remove duplicates from the given linked list
    public Node removeDuplicates(Node head) 
    {
         // Your code here
         HashSet<Integer> h = new HashSet<>();
         
         Node curr = head;
         Node prev = null;
         
         while(curr!=null){
             int x = curr.data;
             if(h.contains(x)){
                 prev.next = curr.next;
                 curr = prev.next;
             }
             else{
                 h.add(x);
                 prev = curr;
                 curr = curr.next;
             }
            
         }
         return head;
    }
}

