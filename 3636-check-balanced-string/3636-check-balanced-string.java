class Solution {
    public boolean isBalanced(String num) {
         int evensum=0;
        int oddsum=0;
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            if(i%2==0){
                int intValue = ch-'0';
                evensum+=intValue;
            }
            else{
               int intValue=ch-'0';
                oddsum+=intValue;
            }
        }
        if(oddsum==evensum)return true;
        return false;
    }
}