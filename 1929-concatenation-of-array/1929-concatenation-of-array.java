class Solution {
    public int[] getConcatenation(int[] nums) {
        int k=nums.length;
         int[]  a=new int[k+k];
        for(int i=0;i<2*k;i++){
            a[i]=nums[i%k];
        }
        return a;
    }
}