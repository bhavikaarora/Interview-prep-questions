/* 
Given a binary tree, find its height.


Sample Input:
3
1 2 3
2 N 1 3 N
10 20 30 40 60 N N

Sample Output:
2
3
3

Explanation:
Testcase1: The tree is
        1
     /      \
   2        3
So, the height would be 2.

*/




class Tree
{
    // return the Height of the given Binary Tree
    int height(Node root) 
    {
         if(root==null) return 0;
         else return Math.max(height(root.left),height(root.right))+1;
    }   
}
