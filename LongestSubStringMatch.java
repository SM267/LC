class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] as=new int[128];
        int left=0;
        int maxlen=0;
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            left=Math.max(left,as[c]);
            maxlen=Math.max(maxlen,r-left+1);
            as[c]=r+1;
        }
        return maxlen;
    }   
}