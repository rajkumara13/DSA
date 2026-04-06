class Solution {
    public int countSubstrings(String s) {
     int count=0;
     for(int i=0;i<s.length();i++){
        count+=palindrome(i,i,s);
        count+=palindrome(i,i+1,s);
     }
     return count;
    }
    public int palindrome(int left,int right,String s){
        int count=0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            count++;
            right++;
            left--;
        }
        return count;
    }
}
