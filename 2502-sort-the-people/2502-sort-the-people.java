class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=names.length;
        Map<Integer,String>map=new HashMap<>();
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String str[]=new String[n];
        for(int i=0;i<names.length;i++){
            str[i]=map.get(heights[n-i-1]);
        }
        return str;
    }
}