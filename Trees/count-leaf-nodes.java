/*
Given a Binary Tree of size N , You have to count leaves in it. For example, there are two leaves in following tree

        1
     /      \
   10      39
  /
5


Example:
Input:
2
3 4 2 
4 8 10 7 N 5 1 3 
Output:
2
3
Explanation:
Test Case 2:  Given Tree is 
                                 4
                               /     \
                            8       10
                          /          /      \
                       7          5        1
                      /
                     3
Three leaves are 3 , 5 and 1.
*/




class Tree
{
    int countLeaves(Node node) 
    {
         // Your code  
         int x,y;
         if(node!=null){
             x = countLeaves(node.left);
             y = countLeaves(node.right);
             
             if(node.left==null && node.right==null)
              return x+y+1;
              else return x+y;
         }
         
         return 0;
    }
}
