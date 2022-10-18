//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String UncommonChars(String A, String B)
    {
        // code here
        boolean a[]=new boolean[26];
        boolean b[]=new boolean[26];
        Arrays.fill(a,false);
        Arrays.fill(b,false);
        for(int i=0;i<A.length();i++){
            a[A.charAt(i)-97]=true;
        }
        // for(int i=0;i<25;i++){
        //     if(a[i]!=0)System.out.print((char)(97+i)+" ");
        // }
        for(int i=0;i<B.length();i++){
             b[B.charAt(i)-97]=true;
        }
  
        String s="";
        String p="-1";
        for(int i=0;i<26;i++){
            if(a[i]^b[i]==true) s+=(char)(97+i);
        }
        return s.length()==0?p:s;
    }
}