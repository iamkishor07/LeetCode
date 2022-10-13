class Solution {
    public int[] getConcatenation(int[] nums) {
        int k=nums.length;
         int[]  a=new int[k+k];
        for(int i=0;i<k;i++){
            a[i]=nums[i];
            a[i+k]=nums[i];
        }
        return a;
    }
}