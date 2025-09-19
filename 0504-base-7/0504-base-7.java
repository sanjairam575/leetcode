class Solution {
    public String convertToBase7(int num) {
        if(num==0)return "0";
        boolean flag=true;
        if(num<0)flag =false;
        StringBuilder sb=new StringBuilder();
        int abs=Math.abs(num);
        while(abs>0){
            int digit=abs%7;
            sb.append(digit);
            abs/=7;
        }
        if (flag==false) sb.append("-");
        return sb.reverse().toString();
    }
}