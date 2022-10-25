class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[]=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int a=target-numbers[i];
            if(map.containsKey(a)){
                ans[0]=map.get(a)+1;
                ans[1]=i+1;
                return ans;
            }else{
                map.put(numbers[i],i);
            }
        }
        return ans;
    }
}