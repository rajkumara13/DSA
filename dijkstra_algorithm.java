import java.util.*;
class Pair{
    int node;
    int weight;
    Pair(int node,int weight){
        this.node=node;
        this.weight=weight;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Pair>>arr=new ArrayList<>();
        for(int i=0;i<=4;i++){
            arr.add(new ArrayList<>());
        }
        arr.get(1).add(new Pair(2,1));
        arr.get(1).add(new Pair(3,4));
        arr.get(2).add(new Pair(4,2));
        arr.get(2).add(new Pair(3, 1));
        arr.get(3).add(new Pair(4,2));
        dji(arr,4);

    }
    public static void dji(ArrayList<ArrayList<Pair>> arr, int v){
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->a.weight-b.weight);
        int[] dist=new int[v];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0]=0;
        pq.offer(new Pair(0,0));
        while(!pq.isEmpty()){
            Pair curr=pq.poll();
            int x=curr.node;
            if(curr.weight >dist[x]) continue;
                for (Pair neib : arr.get(x)) {
                    int ver = neib.node;
                    int wei = neib.weight;
                    if ((dist[x] + wei) < dist[ver]) {
                        dist[ver] = dist[x] + wei;
                        pq.add(new Pair(ver, dist[ver]));
                    }
                }

        }
        for(int x:dist){
            System.out.println(x);
        }

    }
}
