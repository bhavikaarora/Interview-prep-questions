/*

https://leetcode.com/problems/remove-linked-list-elements/
Remove all elements from a linked list of integers that have value val.

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5

*/


class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
      
        while(head!=null && head.val==val){
            head = head.next;
        }
        
        
        if(head==null) return head;
        
        ListNode prev = head;
        ListNode curr = head.next;
        while(curr!=null){
            if(curr.val==val){
                prev.next = curr.next;
                curr = curr.next;
                continue;
            }
            prev = curr;
            curr = curr.next;
            
        }
    return head;
        
    }
}
