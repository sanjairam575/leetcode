class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        int min=Math.min(jewels.length(),stones.length());
        int max=Math.max(jewels.length(),stones.length());
        for(int i=0;i<min;i++){
            for(int j=0;j<max;j++){
                if(min==jewels.length()){
                    if(jewels.charAt(i)==stones.charAt(j)) count++;
                }
                else{
                    if(stones.charAt(i)==jewels.charAt(j)) count++;
                }
            }
        }
        return count;
    }
}