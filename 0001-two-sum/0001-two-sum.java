class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int k=target-nums[i];
            if(map.containsKey(k)) {
                return new int[]{map.get(k),i};
            }
            else{
                map.put(nums[i],i);
            } 
        }
        return new int[] {0,0};
        
    }
}