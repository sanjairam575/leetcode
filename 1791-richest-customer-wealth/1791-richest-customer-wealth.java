class Solution {
    public int maximumWealth(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        int max=0;
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=arr[i][j];
            }
            max=Math.max(max,sum);
        }
        return max;
    }
}