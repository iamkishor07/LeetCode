class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        Arrays.sort(nums);
        int len=nums.length,cnt=0;
        for(int i=0;i<len;i++){
            int target=k-nums[i];
            if(map.containsKey(target)){
                cnt++;
                if(map.get(target) >0 ) map.put(target,map.get(target)-1);
                if(map.get(target)==0) map.remove(target);
            }else{
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
            
        }
        return cnt;
        
    }
}