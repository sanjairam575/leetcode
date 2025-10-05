class Solution {
    public int minPartitions(String n) {
        int maxdigit=0;
        for(int i=0;i<n.length();i++){
            int num=n.charAt(i)-'0';
            if(num>maxdigit){
                maxdigit=num;
            }
        }
    return maxdigit;
    }
}