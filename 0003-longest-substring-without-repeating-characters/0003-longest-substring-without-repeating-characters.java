class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int left=0,end=0,h=0;
        while(end<s.length()){
            char a=s.charAt(end);
            if(map.containsKey(a)){
                left=Math.max(map.get(a)+1,left);
            }
            h=Math.max(h,end-left+1);
            map.put(a,end);
           
            end++;
        }
        return h;
    }
}