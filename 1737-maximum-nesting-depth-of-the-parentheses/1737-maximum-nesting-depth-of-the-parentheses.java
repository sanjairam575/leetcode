class Solution {
    public int maxDepth(String s) {
       int count=0,max=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='('){
                count++;
            }
            else if(s.charAt(i)==')'){
                count--;         
            }
            if(count>max)max=count;
        }
        return max;
    }
}