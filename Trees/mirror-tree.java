/*
https://practice.geeksforgeeks.org/problems/mirror-tree/1

Given a Binary Tree, convert it into its mirror.

Example:
Input:
2
1 3 2
10 20 30 40 60
Output:
2 1 3
30 10 60 20 40

Explanation:
Testcase1: The tree is
        1         (mirror)     1
     /      \         =>        /     \
   3       2                  2         3
The inorder of mirror is 2 1 3
Testcase2: The tree is
                           10                                      10
                        /        \           (mirror)         /        \
                     20         30            =>        30        20
                  /       \                                              /    \
               40       60                                        60    40
The inroder traversal of mirror is 30 10 60 20 40.

*/



class Tree
{
    void mirror(Node node)
    {
	// Your code here
	    if(node==null) return ;
	    
	    mirror(node.left);
	    mirror(node.right);
	    
	    Node temp = node.left;
	    node.left = node.right;
	    node.right = temp;
    }
}
