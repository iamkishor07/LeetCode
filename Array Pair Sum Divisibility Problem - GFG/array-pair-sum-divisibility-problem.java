//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine().trim();
            String[] S1 = s1.split(" ");
            int n = Integer.parseInt(S1[0]);
            int k = Integer.parseInt(S1[1]);
            String s2 = br.readLine().trim();
            String[] S2 = s2.split(" ");
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(S2[i]);
            }
            Solution ob = new Solution();
            boolean ans = ob.canPair(nums, k);
            if (ans)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public boolean canPair(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        if(nums.length % 2!=0)return false;
        for(int i=0;i<nums.length;i++){
            int p=nums[i]%k;
            map.put(p,map.getOrDefault(p,0)+1);
        }
        for(int i=0;i<nums.length;i++){
            int rem= nums[i]%k;
            if(rem==0){
                if(map.get(0)%2!=0)return false;
            }
            else {
                if(map.get(rem)!=map.get(k-rem)){
                    return false;
                    }
            }
        }
        return true;
    }
}

// Oh, I took the modulus of every number with k, then counted all numbers,
// if the count of a number is not the same as the count of what it needs to be added to get k, 
// then it's not possible (example if k is 4 and the number of counts of 1 is 7, 
// the number of counts of 3 should also be 7 so all 1's can pair up with all 3's)
// and we should also consider if the a number is equal to half of k, which means it
// has to be added to itself to get k, so in this case the count that number has to be even 
// so half of the count can pair up with the rest half 
// ( example if k is 6 and the number of counts of 3 is 7, it can't pair up since one will
// be left out, but assuming the count were 12, first 6 can pair up with second 6)