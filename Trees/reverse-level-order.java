/*

Given a Binary Tree of size N. You have to print the Reverse Level Order Traversal of the given tree , that is first you have to print nodes of last level of the tree , then nodes of second last and so on. 

*/
                                           



class Tree
{
	public void reversePrint(Node node) {
	    Queue<Node> q = new LinkedList<>();
	    Stack<Node> st = new Stack<>();
	    q.add(node);
	    while(!q.isEmpty()){
	        Node curr = q.peek();
	        q.remove();
	        st.push(curr);
	        if(curr.right!=null) q.add(curr.right);
	        if(curr.left!=null) q.add(curr.left);
	    }
	    while(!st.isEmpty()){
	        System.out.print(st.peek().data + " "); 
	        st.pop();
	    }
	}
}      
