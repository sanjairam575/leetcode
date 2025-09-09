class Solution {
    public char kthCharacter(int k) {
        String word="a";
        while(word.length()<k){
            int n=word.length();
            for(int i=0;i<n;i++){
                char ch=(char)(word.charAt(i)+1);
                word+=ch;
            }
        }
        char ch1=word.charAt(k-1);
        return ch1;
    }
}