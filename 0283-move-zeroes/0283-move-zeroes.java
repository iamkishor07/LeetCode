class Solution {
    public void moveZeroes(int[] nums) {
        int start=0,end=0;
        while(end < nums.length){
            if(nums[end]==0) end++;
            else{
            int t=nums[end];
            nums[end]=nums[start];
            nums[start]=t;
            start++;
                end++;
            }

            
        }

    }
}