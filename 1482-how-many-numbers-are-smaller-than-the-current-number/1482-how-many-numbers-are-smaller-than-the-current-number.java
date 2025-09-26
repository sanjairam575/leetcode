class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int temp[]=new int[nums.length];
        int index=0;
        for(int num:nums){
            temp[index]=nums[index];
            index++;
        }
        Arrays.sort(temp);
        Map<Integer,Integer>map=new HashMap<>();
        int i=0;
        for(int num:temp){
            if(!map.containsKey(num)){
                map.put(temp[i],i);
            }
            i++;
        }
        int res[]=new int[nums.length];
        int ind=0;
        for(int num:nums){
            res[ind++]=map.get(num);
        }
        return res;
    }
}