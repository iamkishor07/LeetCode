//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            String[] S = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int ans = ob.countTriplets(nums);
            System.out.println(ans);         
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public int countTriplets(int[] nums){
        // code here
        int cntleft=0,cntright=0;
        int cnt=0;
        for(int i=1;i<nums.length;i++){  //middle value of jth element
            cntleft=0;
            for(int j=0;j<i;j++){
                if(nums[j] < nums[i]){ //traverse from the start to mid 
                    cntleft++;
                }
            }
            cntright=0;
            for(int k=i+1;k<nums.length;k++){ //traverse from the middle to end
                if(nums[k] > nums[i]){
                   cntright++;
                }
            }
            cnt+=(cntleft*cntright); //multi bothe left & right so they all can be pair up
        }
        return cnt;
    }
}