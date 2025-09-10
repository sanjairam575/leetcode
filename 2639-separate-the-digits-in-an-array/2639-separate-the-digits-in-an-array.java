class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer>list=new ArrayList<>();
        for(int arr:nums){
            String str=String.valueOf(arr);
            int len=str.length();
            for(int j=0;j<len;j++){
                String s=String.valueOf(str.charAt(j));
                int digit=Integer.parseInt(s);
                list.add(digit);
            }
        }
        int[] res=new int[list.size()];
        int ind=0;
        for(int arr:list){
            res[ind++]=arr;
        }
        return res;
    }
}