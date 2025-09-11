class Solution {
    public String finalString(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch!='i'){
                sb.append(ch);
            }
            else{
                int n=sb.length();
                for(int i=sb.length()-1;i>=0;i--){
                    
                    sb.append(sb.charAt(i));
                }
                sb.delete(0,n);
            }
        }
        return sb.toString();
    }
}