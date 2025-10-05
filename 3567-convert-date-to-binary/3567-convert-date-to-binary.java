class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb=new StringBuilder();
        String[] str=date.split("-");
        for(int i=0;i<str.length;i++){
        sb.append(Integer.toBinaryString(Integer.parseInt(str[i])));
        sb.append("-");
        }
        return sb.toString().substring(0,sb.length()-1);
    }
}