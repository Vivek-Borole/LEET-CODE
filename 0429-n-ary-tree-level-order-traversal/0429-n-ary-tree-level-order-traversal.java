/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Queue<Node> q = new LinkedList<>();
        if(root == null) return ans;
        q.offer(root);
        while(!q.isEmpty()){
            int noOfLvl = q.size();
            List<Integer> bucket = new ArrayList<>();
            for(int i =0; i<noOfLvl; i++){
                Node node = q.poll();
                bucket.add(node.val);
                for(Node child : node.children){
                    if(child!= null) q.offer(child);
                }
            }
            ans.add(bucket);
        }
        
        return ans;
        
    }
}