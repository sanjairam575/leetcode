class Solution {
    public int maxFreqSum(String s) {
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        for(char ch:s.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                freq1[ch-'a']++;
            }
            else freq2[ch-'a']++;
        }
        int max1=0,max2=0;
        for(int i=0;i<freq1.length;i++){
            max1=Math.max(max1,freq1[i]);
        }
        for(int i=0;i<freq2.length;i++){
            max2=Math.max(max2,freq2[i]);
        }
    return max1+max2;
    }
}