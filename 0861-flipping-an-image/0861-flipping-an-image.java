class Solution {
    public int[][] flipAndInvertImage(int[][] nums) {
        List<List<Integer>>mainList=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            List<Integer>subList=new ArrayList<>();
            for(int j=n-1;j>=0;j--){
                subList.add(nums[i][j]);
            }
            mainList.add(subList);
        }
        int res[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mainList.get(i).get(j)==0){
                    res[i][j]=1;
                }
                else res[i][j]=0;
            }
        }
        return res;
    }
}