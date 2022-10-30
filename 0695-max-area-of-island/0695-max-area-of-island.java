class Solution {
     public static int fill(int[][] a,int n,int m,int i,int j){
        if( i<0 || i==n || j<0 ||  j==m || a[i][j]==0) return 0;
         int count=1;
            a[i][j]=0;
            count+=fill(a,n,m,i+1,j);
            count+=fill(a,n,m,i,j+1);
            count+=fill(a,n,m,i-1,j);
            count+=fill(a,n,m,i,j-1);
         return count;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        int n=grid.length,m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    max=Math.max(max,fill(grid,n,m,i,j));
                }
            }
        }
        return max;
        
    }
}