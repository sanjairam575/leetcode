class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int res[]=new int[friends.length];
        Set<Integer>set=new HashSet<>();
        for(int nums:friends){
            set.add(nums);
        }
        List<Integer>list=new ArrayList<>();
        for(int nums:order){
            if(set.contains(nums)){
                list.add(nums);
            }
        }
        int i=0;
        for(int nums:list){
            res[i++]=nums;
        }
        return res;
    }
}