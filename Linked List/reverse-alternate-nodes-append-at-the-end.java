/*

https://practice.geeksforgeeks.org/problems/given-a-linked-list-reverse-alternate-nodes-and-append-at-the-end/1

Given a linked list, you have to perform the following task:

Extract the alternative nodes from starting from second node.
Reverse the extracted list.
Append the extracted list at the end of the original list.




Input:
2
8
10 4 9 1 3 5 9 4
5
1 2 3 4 5

Output:
10 9 3 9 4 5 1 4
1 3 5 4 2 

*/

class Main
{
    public static void rearrange(Node head)
    {
        // add your code here
        if (head.next==null || head.next.next==null) return ;
        Stack<Node> s=new Stack<Node>();
        Node a=head,b=null;
        while(a!=null) {
            b = a.next;
            if(b!=null) {
                a.next=b.next;
                b.next=null;
                s.push(b);
                if (a.next!=null)
                    a=a.next; //
                else
                    break;
            }
            else
                break; 
        }
        Node temp=null;
        while(s.size()!=0)
        {
            temp=s.pop();
            a.next=temp;
            a=temp;
        }
        
    }
}
