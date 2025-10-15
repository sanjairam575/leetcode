class Solution {
    public String reverseWords(String s) {
        String[] str=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length;i++){
            String reverse = new StringBuilder(str[i]).reverse().toString();
            sb.append(reverse).append(" ");
            
        }
        return sb.toString().trim();
    }
}