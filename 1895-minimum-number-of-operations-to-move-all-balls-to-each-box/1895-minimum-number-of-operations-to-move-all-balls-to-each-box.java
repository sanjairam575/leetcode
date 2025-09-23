class Solution {
    public int[] minOperations(String boxes) {
       int res[]=new int[boxes.length()];
       
        for(int i=0;i<boxes.length();i++){
             int count=0;
            char ch=boxes.charAt(i);
            for(int j=0;j<boxes.length();j++){
                char ch1=boxes.charAt(j);
                if(Math.abs(i-j)>=1&&ch1=='1'){
                    int sum=Math.abs(i-j);
                    count+=sum;
                }
            }
            res[i]=count;
        }
        return res;
    }
}