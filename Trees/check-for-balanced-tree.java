/*
Given a binary tree, find if it is height balanced or not. 
A tree is height balanced if difference between heights of left and right subtrees is not more than one for all nodes of tree. 

Input:
3
1 2 N N 3
10 20 30 40 60 N N
4 6 6
Output:
0
1
1
Explanation:
Testcase1: The tree is
        1
     /    
   2
      \
       3 
The max difference in height of left subtree and right subtree is 2, which is greater than 1. Hence unbalanced.
Testcase2: The tree is
                           10
                        /        \
                     20         30
                  /       \
               40       60
The max difference in height of left subtree and right subtree is 1. Hence balanced.

*/



class Tree
{
     /* This function should return tree if passed  tree 
     is balanced, else false. */
    boolean isBalanced(Node root)
    {
	// Your code here
	    if(root==null) return true;
	    int lt = height(root.left);
	    int rt = height(root.right);
	    if(Math.abs(lt-rt)<=1 && isBalanced(root.left) && isBalanced(root.right)) return true;
	    else return false;
    }
    
    int height(Node root){
        if(root==null) return 0;
        int lt = height(root.left);
        int rt = height(root.right);
        if(lt>rt) return lt+1;
        else return rt+1;
    }
}
