class Solution {
    HashMap<Node,Node>map=new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node==null)return node;
        return dfs(node);
    }
    public Node dfs(Node node){
          if(map.containsKey(node))return map.get(node);
          Node copy=new Node(node.val);
          map.put(node,copy);
          for(Node neighnode:node.neighbors){
            copy.neighbors.add(dfs(neighnode));
          }
          return copy;

    }
}
