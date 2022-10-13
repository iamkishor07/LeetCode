class Solution {
    public int[] runningSum(int[] nums) {
        int k=nums.length;
        int[] a=new int[k];
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
            a[i]=sum;
        }
        return a;
    }
}