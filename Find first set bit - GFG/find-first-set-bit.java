//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//taking testcases
		while(t-->0){
			int n=sc.nextInt();//input n
			Solution ob=new Solution();
			System.out.println(ob.getFirstSetBit(n));//calling method
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
            
        // Your code here
        int pos=0;
        while(n>0){
            if((n & 1)==1) return pos+1; //we check the last bit with & 1 it return 1 if it contains last bit as 1
            
            pos++; //we keep incrementing the pos as the index from 0
            n=n>>1; // and every time we are right shifting the n untill it becomes 0
        }
        return n;
            
    }
}