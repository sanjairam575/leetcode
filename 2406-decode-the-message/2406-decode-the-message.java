class Solution {
    public String decodeMessage(String key, String message) {
        key=key.replace(" ","");
        Map<Character,Character>map=new HashMap<>();
        char ch[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int i=0;
        for(char ch1:key.toCharArray()){
            if(!map.containsKey(ch1)){
                map.put(ch1,ch[i]);
                i++;
            }
            if(i==26) break;
        }
        String str="";
        for(char ch1:message.toCharArray()){
            if(ch1==' '){
                str+=' ';
            }else{
                str+=map.get(ch1);
            }
        }return str;
    }
}