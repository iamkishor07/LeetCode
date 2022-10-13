class Solution {
    public static void reverse(int [] a,int i,int j){
        while(i<=j){
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        
        int len=nums.length;
        k=k%len;
        reverse(nums,0,len-1);
        reverse(nums,0,k-1);
        reverse(nums,k,len-1);
    }
}