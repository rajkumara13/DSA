class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       if(strs.length ==0)return new ArrayList<>();
       Map<String,List<String>>map=new HashMap<>();
       for(String temp:strs){
         char [] arr=temp.toCharArray();
         Arrays.sort(arr);
         String s=new String(arr);
         if(map.containsKey(s)){
            map.get(s).add(temp);
        }
        else{
            List<String>list=new ArrayList<>();
            list.add(temp);
            map.put(s,list);
        }
      }
      return new ArrayList<>(map.values());
    }
}
