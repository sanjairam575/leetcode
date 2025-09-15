class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            Arrays.sort(grid[i]);
        }
        int res=0;
        int max=0;
        for(int j=0;j<n;j++){
            for(int i=0;i<m;i++){
                max=Math.max(max,grid[i][j]);
            }
            res+=max;
        }
        return res;
    }
}