//{ Driver Code Starts
import java.io.*;
import java.util.*;

// } Driver Code Ends
class Solution{
    static String maxSum(String w,char x[],int b[], int n){
        //code here
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<n;i++){
            map.put(x[i],b[i]);
        }
        String ans="";
        String localans="";
        int sum=0;
        int min=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<w.length();i++){
            char a=w.charAt(i);
            if(map.containsKey(a)){
                sum+=map.get(a);
            }else{
                sum+=(int)a;
                
            }
            localans+=a;
            if(min<sum){
                min=sum;
                ans=localans;
            }
            // System.out.println(sum +"  "+index);
            if(sum<0){
                localans="";
                sum=0;}
        }
        // if(index==0) return w;
        // for(int i=index;i<w.length();i++){
        //     ans+=w.charAt(i);
        // }
        return ans;
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String w = read.readLine();
            int n = Integer.parseInt(read.readLine());
            String TE[] = read.readLine().trim().split(" ");
            char x[] = new char[n];
            for(int i = 0;i<n;i++)
            {
                x[i] = TE[i].charAt(0);
            }
            
            String TR[] = read.readLine().trim().split(" ");
            int b[] = new int[n];
            for(int i = 0;i<n;i++)
            {
                b[i] = Integer.parseInt(TR[i]);
            }
           
            Solution ob = new Solution();
            System.out.println(ob.maxSum(w,x,b,n));
        }
    }
}
// } Driver Code Ends