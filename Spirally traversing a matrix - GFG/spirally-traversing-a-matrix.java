//{ Driver Code Starts
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
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> ans=new ArrayList<Integer>();
        
        int k=0; //starting row
        int l=0; //starting col
        
        //steps
        // 1.Traverse and increment k which is starting row k++
        // 2.Traverse and decrement c which is end of column c--
        // 3.Traverse and decrement r which is end of the row r--
        // 4.Traverse and increment l which is starting of col l++
        
        while(k<r && l<c){
            
        for(int i=l;i<c;i++){
            ans.add(matrix[k][i]);
        }
        k++;
        for(int i=k;i<r;i++){
            ans.add(matrix[i][c-1]);
        }
        c--;
        if(k<r) {
            for(int i=c-1;i>=l;i--){
                ans.add(matrix[r-1][i]);
            }
            r--;
        }
        if(l<c){
          for(int i=r-1;i>=k;i--){
            ans.add(matrix[i][l]);
            }
            l++;  
        } 
        }
        return ans;
    }
}
