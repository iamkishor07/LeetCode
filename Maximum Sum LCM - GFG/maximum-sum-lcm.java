//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.maxSumLCM(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static long maxSumLCM(int n) {
        long cnt=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                if(n/i==i){ //if the number that is perfect square we take it only 1 time
                    cnt+=i;
                }else{
                    cnt+=i+n/i; //if it's not a perfect square we add i and n/i values 
                                  // example for n=21 it's sqrt=4 ;
                                  // for i=3 21/3 = 7 ie. 21%3==0 && 21%7==0 ( we add 3 & 7 )
                                  // ie.add i+ (n/i);
                    }
            }
        }
        return cnt;
    }
}