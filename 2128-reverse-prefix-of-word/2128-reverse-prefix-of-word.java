class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder();
           String s=word.substring(0,word.indexOf(ch)+1);
           sb.append(s).reverse();
           String str=word.substring(word.indexOf(ch)+1,word.length());
           sb.append(str);
           return sb.toString();

    }
}