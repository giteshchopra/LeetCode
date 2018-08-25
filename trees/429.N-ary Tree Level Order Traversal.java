/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
      
           
        Queue<Node> queue = new LinkedList<Node>();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root == null)
            return list;
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> subList = new ArrayList<Integer>();
            for(int i = 0; i < size; i++){
                Node node = queue.poll();
                subList.add(node.val);
                for(int j = 0; j < node.children.size();j++){
                    queue.add(node.children.get(j));
                }
                
            }
            list.add(subList);
        }
        return list;
        
    }
}
