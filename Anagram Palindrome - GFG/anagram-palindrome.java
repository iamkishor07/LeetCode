//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    public static void main (String[] args)
    {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0;i<t;i++){
		    String s = in.next();
		    if (new Sol().isPossible (s) == 1)
		        System.out.println ("Yes");
		    else
		        System.out.println ("No");
		}
	}
}

// Contributed By: Pranay Bansal


// } Driver Code Ends


class Sol
{
    int isPossible (String S)
    {
        int freq[]=new int[26];
        for(int i=0;i<S.length();i++){
            freq[S.charAt(i)-'a']++;
        }
        int cnt=0;
        for(int i=0;i<26;i++){
            if(freq[i]%2!=0)cnt++;
            if(cnt>1) return 0;
        }
        return 1;
    }
}