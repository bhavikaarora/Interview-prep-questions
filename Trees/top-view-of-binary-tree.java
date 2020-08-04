/*
Given below is a binary tree. The task is to print the top view of binary tree. Top view of a binary tree is the set of nodes visible when the tree is viewed from the top. For the given below tree

       1
    /     \
   2       3
  /  \    /   \
4    5  6   7

Top view will be: 4 2 1 3 7

https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1

*/



class View
{
    // function should print the topView of the binary tree
    static void topView(Node root)
    {
        // add your code
        class QueueObj{
            Node node;
            int hd;
        
        QueueObj(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    
    Queue<QueueObj> q = new LinkedList<>();
    Map<Integer, Node> hm = new TreeMap<>();
    
    if(root==null) return;
    else q.add(new QueueObj(root,0));
    
    while(!q.isEmpty()){
        QueueObj x = q.poll();
        if(!hm.containsKey(x.hd)){
            hm.put(x.hd, x.node);
        }
        
        if(x.node.left!=null){
            q.add(new QueueObj(x.node.left, x.hd-1));
        }
        
        if(x.node.right!=null){
            q.add(new QueueObj(x.node.right, x.hd+1));
        }
    }
    for(Map.Entry<Integer,Node> entry: hm.entrySet()){
              System.out.print(entry.getValue().data+" ");
          }
}
}
