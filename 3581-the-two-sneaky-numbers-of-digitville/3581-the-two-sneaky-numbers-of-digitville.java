class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        List<Integer>list=new ArrayList<>();
        int freq[]=new int[101];
        for(int num:nums){
            freq[num]++;
        }
        for (int i=0;i<freq.length;i++){
            if(freq[i]==2) list.add(i);
        }
        int res[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }return res;
    }
}