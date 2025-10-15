class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count=0;
        int res[]=new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            res[i]=nums.get(i);
        }
        for(int i=0;i<res.length;i++){
            for(int j=i+1;j<res.length;j++){
                if(res[i]+res[j]<target) count++;
            }
        }
        return count;
    }
}