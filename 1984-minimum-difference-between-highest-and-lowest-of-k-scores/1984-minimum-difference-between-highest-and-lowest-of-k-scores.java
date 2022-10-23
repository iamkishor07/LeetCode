class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length && i+k-1 < nums.length;i++){
            int s=i;
            int end=i+k-1;
            ans=Math.min(ans,nums[end]-nums[i]);
        }
        return ans;
    }
}