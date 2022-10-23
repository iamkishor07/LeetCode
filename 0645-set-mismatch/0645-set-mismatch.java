class Solution {
    public int[] findErrorNums(int[] nums) {
        int a[]=new int[2];
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        int len=nums.length;
        int total=len*(len+1)/2;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                a[0]=i;
                a[1]=total+i -sum;
                return a;
            }else{
                map.put(i,0);
            }
        }
        return a;
        
    }
}