//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        long a[]=new long[n];
        long b[]=new long[n];
        long r=arr[0];
        if(n==1) return 1;
        for(int i=1;i<n;i++){
            a[i-1]=r;
            r+=arr[i];
        }
        int l=0;
         for(int i=n-1;i>=0;i--){
            l+=arr[i];
            b[i]=l;
        }
        for(int i=0;i<n;i++){
            if(a[i]==b[i]) return i+1;
        }
        return -1;
    
    }
}
