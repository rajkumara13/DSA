class Solution{
    public boolean findTarget(TreeNode root, int k){
        HashSet<Integer>set=new HashSet<>();
       return check(root,k,set);
    }
    public boolean check(TreeNode root,int k,HashSet<Integer>set){
      if(root==null)return false;
      int val=k-root.val;
      if(set.contains(root.val)){
        return true;
      }
      set.add(val);
      return check(root.left,k,set) || check(root.right,k,set);
    }   
}
