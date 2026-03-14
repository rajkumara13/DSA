package org.example;
import java.util.*;
class Graph{
    List<List<Integer>>graph;
    boolean [] vis;
    int ver;
    Graph(int ver){
        this.ver=ver;
        graph=new ArrayList<>();
        for(int i=0;i<ver;i++){ // add empty vertices
            graph.add(new ArrayList<>());
            vis=new boolean[ver];//visited value check use this
        }
    }
    void addEdge(int src ,int dest){
        graph.get(src).add(dest);
        graph.get(dest).add(src);
    }
    void print(){
        for(int i=0;i<ver;i++){
            System.out.print(i + "-->");
            for(int node:graph.get(i)){
                System.out.print(node+" ");
            }
            System.out.println();
        }
    }

    void dfs(int node){
        vis[node]=true;
        System.out.print(node+" -->");
        for(int adj : graph.get(node)){
            if(!vis[adj]){
                dfs(adj);
            }
        }
    }
    void bfs(){
        Queue<Integer> queue=new LinkedList<>();
        vis[0]=true;
        queue.offer(0);
        while(!queue.isEmpty()){
            int node1=queue.poll();
            System.out.print(node1 +"-->");
            for(int adj : graph.get(node1)){
                     if(!vis[adj]) {
                         vis[adj] = true;
                         queue.offer(adj);
                     }
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Graph g=new Graph(5);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(0,2);
        g.addEdge(3,2);
        g.addEdge(4,2);
        g.print();
        g.bfs();
        }
    }
