/*
Given a Binary Tree, find diameter of it.
The diameter of a tree is the number of nodes on the longest path between two leaves in the tree.

Example:
Input:
2
1 2 3
10 20 30 40 60 

Output:
3
4

Explanation:
Testcase1: The tree is
        1
     /      \
   2        3
The diameter is of 3 length.
Testcase2: The tree is
                           10
                        /        \
                     20         30
                  /       \
               40       60
The diameter is of 4 length.

*/

//reference link:  https://youtu.be/ep47E02vgF8

class Tree {
    /* Complete the function to get diameter of a binary tree */
    int diameter(Node root) {
        // Your code here
        
        if(root==null) return 0;
        
        //longest diameter passes through root
        int lh = height(root.left);
        int rh = height(root.right);
        int total = lh+rh+1;
        
        //longest diameter wont pass through root
        int ld = diameter(root.left);
        int rd = diameter(root.right);
        int max = Math.max(ld,rd);
        
        int ans = Math.max(max,total); 
        return ans;
    }
    
    int height(Node root){
        if(root==null) return 0;
        
        int l = height(root.left);
        int r = height(root.right);
        return 1+Math.max(l,r);
    }
}


//2nd solution
//ADITYA VERMA VIDEO COMMENT

public class Solution {
    int max = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }
    
    private int maxDepth(TreeNode root) {
        if (root == null) return 0;
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        max = Math.max(max, left + right);
        
        return Math.max(left, right) +1;
    }
}





