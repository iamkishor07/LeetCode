class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int left=0,end=0,h=0;
        while(end<s.length()){
            char a=s.charAt(end);
            map.put(a,map.getOrDefault(a,0)+1);
            
            while(map.get(a)>1){
                char l=s.charAt(left);
                map.put(l,map.get(l)-1);
                left++;
            }
            h=Math.max(h,end-left+1);
            end++;
        }
        return h;
    }
}