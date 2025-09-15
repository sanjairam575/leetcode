class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String str[]=text.split(" ");
        int count=0;
        for(int i=0;i<str.length;i++){
            boolean flag=true;
            for(int j=0;j<brokenLetters.length();j++){
                if(str[i].indexOf(brokenLetters.charAt(j))!=-1){
                    flag=false;
                    break;
                }
            }
            if(flag) count++;
        }
        return count;
    }       
}