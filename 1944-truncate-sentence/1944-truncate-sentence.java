class Solution {
    public String truncateSentence(String s, int k) {
        int count=k;
        String[] str=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length;i++){
            if(count==0){
                break;
            }
            sb.append(str[i]).append(" ");
            count--;
        }
        return sb.toString().trim();
    }
}