class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer>map=new HashMap<>();
        for(char ch:s.toCharArray()){
           // if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                map.put(ch,map.getOrDefault(ch,0)+1);
            
        }
        int vmax=0,cmax=0;
        for(char ch : s.toCharArray()){
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                if(vmax<map.get(ch)){
                    vmax=map.get(ch);
                }
           }
           else{
            if(cmax<map.get(ch)){
            cmax=map.get(ch);
           }
        }
        }
        return vmax+cmax;
    }
}