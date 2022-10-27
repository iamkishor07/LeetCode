class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int start = 0;
        int cnt = 0;
        int end = nums.length-1;
        while(start < end){
            if(nums[start] + nums[end] == k){
                cnt ++;
                start++;
                end--;
            }else if(nums[start] + nums[end] > k){
                end--;
            }else{
                start++;
            }
        }
        return cnt;
    }
}