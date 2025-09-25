class Solution {
    public int findPermutationDifference(String s, String t) {
        Map<Character,Integer>map=new HashMap<>();
        int ind=0;
        for(char ch:t.toCharArray()){
            map.put(ch,ind);
            ind++;
        }
        int sum=0;
        for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           int index=map.get(ch);
           sum+=Math.abs(i-index);
        }
        return sum;
    }
}