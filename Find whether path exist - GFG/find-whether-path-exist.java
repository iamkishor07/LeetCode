//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] grid = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            boolean ans = obj.is_Possible(grid);
            if(ans)
                System.out.println("1");
            else 
                System.out.println("0");
        }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to find whether a path exists from the source to destination.
    public static void isPath(int[][] grid,int i,int j,int n,Boolean[][] visited){
        
        
        //checks the i ,j are under the bounded conditions 
        if(i>=n || i<0  || j>=n || j<0 || grid[i][j]==0 || visited[i][j]==true ) return ;
        //if they are in bounded conditions we visit it and traverse in the four directions
        visited[i][j]=true; //mark as the current node as visited  so, that in next iteration we wont visit it again
        isPath(grid,i-1,j,n,visited);
        isPath(grid,i,j-1,n,visited);
        isPath(grid,i+1,j,n,visited);
        isPath(grid,i,j+1,n,visited);
        
        return ;
        
    }
    public boolean is_Possible(int[][] grid)
    {
        int n=grid[0].length;
        Boolean visitedpath[][]=new Boolean[n][n]; //to keep track of the visited cells
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                    visitedpath[i][j] = false; //initializing all the cells at the beginning with false;
                    
        int scr_x=0,scr_y=0; // source points
        int des_x=0,des_y=0; // destination points
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    scr_x=i;
                    scr_y=j;
                }
                if(grid[i][j]==2){
                    des_x=i;
                    des_y=j;
                }
            }
        }
        isPath(grid,scr_x,scr_y,n,visitedpath); // method that traverse entire matrix starting from the source
        return visitedpath[des_x][des_y];
    }
}