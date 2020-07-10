/*

Given two singly linked lists of size N and M, write a program to get the point where two linked lists intersect each other.

Input:
2
2 3 2
10 20
30 40 50
5 10
2 3 2
10 20
30 40 50
10 20
Output:
5
10

*/

class Intersect
{
	int intersectPoint(Node headA, Node headB)
	{
        Stack<Node> s1 = new Stack<>();
	    Stack<Node> s2 = new Stack<>();
	    
	    Node temp = headA;
	    while(headA!=null){
	        s1.push(headA);
	        headA = headA.next;
	    }
	    
	    temp = headB;
	    while(headB!=null){
	        s2.push(headB);
	        headB = headB.next;
	    }
	    
	    while(s1.peek()==s2.peek()){
	        temp = s1.pop();
	        s2.pop();
	    }
	    
	    return temp.data;
	    
	}
}


