//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.downwardDigonal(n, matrix);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<Integer> downwardDigonal(int N, int A[][])
    {
        // code here 
        ArrayList<Integer> l=new ArrayList<>();
        ArrayList<ArrayList<Integer>> a=new ArrayList<>();
        for(int k=0;k<2*N-1;k++){
            a.add(new ArrayList<Integer>());
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                a.get(i+j).add(A[i][j]);
                }
        }
        // for(ArrayList<Integer> i:a){
        //     System.out.println(i+" ");
        // }
        for(int i=0;i<a.size();i++ ){
            for(int j=0;j<a.get(i).size();j++) l.add(a.get(i).get(j));
        }
        return l;
    }
}
