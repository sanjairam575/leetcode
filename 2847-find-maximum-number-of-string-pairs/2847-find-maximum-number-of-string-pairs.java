class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        List<String>list=new ArrayList<>();
        int count=0;
        String reversed="";
        for(int i=0;i<words.length;i++){
            String str=words[i];
            char ch1=str.charAt(0);
            char ch2=str.charAt(1);
            if(ch1>ch2){
                reversed=""+ch2+ch1;
                list.add(reversed);
            }
            else{
                reversed=""+ch1+ch2;
                list.add(reversed);
            }
        }
        String[] s=list.toArray(new String[0]);
        Arrays.sort(s);
        for(int i=0;i<s.length-1;i++){
            for(int j=i+1;j<s.length;j++){
                if(s[i].equals(s[j])){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}