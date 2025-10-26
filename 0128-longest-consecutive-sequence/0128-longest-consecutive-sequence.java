class Solution {
    public int longestConsecutive(int[] nums) {
        int count=0,max=0;
        Arrays.sort(nums);
        if(nums.length==0) return 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]==1) count++;
        else if(nums[i]==nums[i+1]) continue;
        else {
            count=0;
            }
            max=Math.max(max,count);
        }
        return max+1;
    }
}