//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Main{
    
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		
		//input number of testcases
		int t=sc.nextInt();
		int m,n;
		while(t-->0) {
		    
		    
            Solution obj = new Solution();
            //input m and n
		    m = sc.nextInt();
		    n = sc.nextInt();
		    System.out.println(obj.posOfRightMostDiffBit(m, n));
		}
	}
}




// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
        int pos=0;
        while(m>0 || n>0){
            if( (m&1) != (n&1)){ // if the last bit and is different for the both m & n then return;
                return pos+1;
            }
            pos++;//incrementing the pos as we go on shifiting the last most bit
            n=n>>1; 
            m=m>>1;
        }
        return -1;
            
    }
}


