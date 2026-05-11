class Solution {
    public int[][] merge(int[][] intervals) {
       ArrayList<int[]>arr=new ArrayList<>();
       Arrays.sort(intervals,(a,b)-> a[0] - b[0]);
        int [] curr=intervals[0];
       for(int i=1;i<intervals.length;i++){
         if(curr[1]>=intervals[i][0]){
            curr[1]=Math.max(intervals[i][1],curr[1]);            
         }
         else{
            arr.add(curr);
            curr=intervals[i];
         }
      }
     arr.add(curr);
     return arr.toArray(new int[arr.size()][]); 
   }
}
