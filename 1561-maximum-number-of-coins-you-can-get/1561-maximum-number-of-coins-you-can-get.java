class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum=0;
        int j=piles.length-1;
        for(int i=0;i<piles.length/3;i++){
            sum+=piles[j-1];
            j=j-2;
        }
        return sum;
    }
}