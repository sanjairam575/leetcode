class Solution {
    public int smallestEvenMultiple(int n) {
        int sum=0,max=Integer.MAX_VALUE;
        for(int i=n;i<=max;i++){
            if(i%2==0&&i%n==0){
                sum=i;
                break;
            }
        }
        return sum;
    }
}