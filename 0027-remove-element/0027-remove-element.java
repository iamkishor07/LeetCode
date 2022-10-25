class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        for(int k:nums){
            if(k==val) continue;
            nums[i++]=k;
        }
        return i;
    }
}