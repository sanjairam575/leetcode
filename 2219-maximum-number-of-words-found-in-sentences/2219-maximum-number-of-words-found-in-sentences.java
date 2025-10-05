class Solution {
    public int mostWordsFound(String[] sentences) {
        String str="";
       int maxspace=0;
        for(int i=0;i<sentences.length;i++){
            str=sentences[i];
             int currentspace=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==' ') currentspace++;
            }
            if(currentspace>maxspace) maxspace=currentspace;
        }
        return maxspace+1;
    }
}