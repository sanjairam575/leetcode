class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=words.length;
        for(int i=0;i<words.length;i++){
            String str=words[i];
            for(int j=0;j<str.length();j++){
                if(!allowed.contains(""+str.charAt(j))){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}