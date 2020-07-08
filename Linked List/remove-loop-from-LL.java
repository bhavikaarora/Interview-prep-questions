/*
https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1/

You are given a linked list of N nodes. The task is to remove the loop from the linked list, if present.

Input:
First line of input contains number of testcases T. T testcases follow. For each testcase, first line of input contains length N of the linked list and next line contains N data of the linked list. The third line contains the position of the node(from head) to which the last node will get connected. If it is 0 then there is no loop.

Output:
For each testcase, in a new line, 1 will be printed if loop is removed and the list still has all N nodes connected to it, else 0 will be printed.



Example:
Input:
2
3
1 3 4
2
4
1 8 3 4
0
Output:
1
1

Explanation:
Testcase 1: In the first test case N = 3.The linked list with nodes N = 3 is given. Here, x = 2 which means last node is connected with xth node of linked list. Therefore, there exists a loop. 
Testcase 2: N = 4 and x = 0, which means lastNode->next = NULL, thus the Linked list does not contains any loop.
*/





class solver
{
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        HashSet<Node> s = new HashSet<Node>();
        while(head.next!=null){
            if(s.contains(head.next)){
                head.next=null;
                return;
            }
            s.add(head);
            head = head.next;
        }
        return;
        
    }
}
