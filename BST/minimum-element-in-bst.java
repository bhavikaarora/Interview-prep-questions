/*
Given a Binary Search Tree. The task is to find the minimum element in this given BST. If the tree is empty, there is no minimum elemnt, so print -1 in that case.



Input:
2
5 4 6 3 N N 7 1
9 N 10 N 11
Output:
1
9

Explanation:
Testcase 1: We construct the following BST by inserting given values one by one in an empty BST.
            5
          /     \
       4         6
     /              \
   3                7
   /
 1

The minimum value in the given BST is 1.
*/



class Tree
{
    int minValue(Node node)
    {
       if(node==null) return -1;
       else if(node.left==null) return node.data;
       else return minValue(node.left);
    }
}
