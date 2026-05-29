class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] vis=new boolean[n];
       ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        dfs(source,vis,graph,destination);
      //  for(boolean val:vis)System.out.print(val+"-");
        return vis[destination];
    }
    public void dfs(int node,boolean[]vis,ArrayList<ArrayList<Integer>>graph,int dest){
            vis[node]=true;
            if(dest==node)return;
            for(int adj:graph.get(node)){
                if(!vis[adj]){
                    dfs(adj,vis,graph,dest);
                }
            }
           }
    }
